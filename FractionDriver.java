
public class FractionDriver
{
    
    public static void main(String args[]){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(3,6);
        Fraction f3 = new Fraction(f1);
        Fraction f4 = new Fraction("1/2");
        /*System.out.println(f3);
        // accessor methods
        System.out.println(f2.getDenom());
        String ans = f2.toString();
        System.out.println(ans);
        System.out.println(f2.toDouble());
        */
        // mutator methods
        /*f2.reduce(); 
        f2.setNum(4);
        f2.setDenom(1);
        System.out.println(f2);
        */
        // static methods
        System.out.println(f2+"*"+f4+"="+Fraction.multiply(f2,f4));
        f2.multiplyTo(f4);
        System.out.println(f2);
    }

}
