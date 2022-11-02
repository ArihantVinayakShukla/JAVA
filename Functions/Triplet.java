import java.util.Scanner;

public class Triplet {
    public static void numbers(double a, double b, double c)
    {
        if(a>b && a>c)
        {
        if(a == Math.sqrt((b*b)+(c*c)))
        {
            System.out.println(a+", "+b+" and "+c+" is a pythagorean triplet");
        }
        else
        {
            System.out.println(a+", "+b+" and "+c+" is not a pythagorean triplet");
        }
        }
        else
        {
            System.out.println("Make sure first number should be greatest");
        }
    }

    public static void main(String[] args)
    {
        double a, b, c;

        Scanner input  = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        numbers(a,b,c);
    }
}
