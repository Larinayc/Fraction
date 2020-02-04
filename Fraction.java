
class Fraction
{
    private int num, denom;

    public Fraction(){ //default constructor
        this.num = 1;
        this.denom = 1;
        this.reduce();
    }

    public Fraction(int num, int denom){ //constuctor 
        this.num = num;
        if(denom==0){
            System.out.println("Error, setting denominator to 1"); 
            this.denom = 1; 
        }
        else{
            this.denom = denom;
        }
        this.reduce();
    }

    public Fraction(String f){//constructor
        int s=f.indexOf("/");
        String num = f.substring(0,s);
        String denom = f.substring(s+1);
        this.num = Integer.parseInt(num);
        if(denom.equals("0")){
            System.out.println("Error, setting denominator to 1");
            this.denom = 1;
        }
        else{
            this.denom = Integer.parseInt(denom); 
        }
        this.reduce();
    }

    public Fraction(Fraction f){ // copy constructor
        this.num = f.num;
        this.denom = f.denom;
        this.reduce();
    }

    //accessor methods:
    public int getNum(){
        return this.num;
    }

    public int getDenom(){
        return this.denom;
    }

    public String toString(){
        return this.num + "/" +this.denom;
    }

    public double toDouble(){
        return ((double)this.num)/this.denom;
    }

    //mutator methods:
    public void reduce(){
        int cgf = cgf(num, denom);
        num = num/cgf;
        denom = denom/cgf;
        if(num<0 && denom<0){
            num=num*-1;
            denom=denom*-1;
        }
    }

    private int cgf(int b, int s){ // helper method
        while(b!=s){
            if(b<s){
                int x=b;
                b=s;
                s=x;
            }
            b=b-s;
        }
        return b;
    }

    public void setNum(int num){
        this.num=num;
    }

    public void setDenom(int denom){
        this.denom=denom;
    }

    //static methods
    public static Fraction multiply(Fraction f1, Fraction f2){
        int num=f1.num * f2.num;
        int denom=f1.denom * f2.denom;
        Fraction ans=new Fraction(num,denom);
        ans.reduce();
        return ans;
    }

    public static Fraction divide(Fraction f1, Fraction f2){
        int num=f1.num * f2.denom;
        int denom=f1.denom * f2.num;
        Fraction ans=new Fraction(num,denom);
        ans.reduce();
        return ans;
    }
    
    public static Fraction add(Fraction f1, Fraction f2){
        int denom=f1.denom * f2.denom;
        int num1=f1.num * f2.denom;
        int num2=f2.num * f1.denom;
        int num=num1+num2;
        Fraction sum = new Fraction(num,denom);
        sum.reduce();
        return sum;
    }
    
    public static Fraction subtract(Fraction f1, Fraction f2){
        int denom=f1.denom * f2.denom;
        int num1=f1.num * f2.denom;
        int num2=f2.num * f1.denom;
        int num=num1-num2;
        Fraction sum = new Fraction(num,denom);
        sum.reduce();
        return sum;
    }
    
    public void multiplyTo(Fraction f){
        this.num=this.num * f.num;
        this.denom=this.denom * f.denom;
        this.reduce();
    }
}
