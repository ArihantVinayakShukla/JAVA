import java.util.Scanner;

class Arpri
{
    public static void Area (int r)
    {
        double a = (3.14)*r*r;
        System.out.println("The area of the circle "+ a);
    }

    public static void Circumference (int r)
    {
        double b = 2*(3.14)*r;
        System.out.println("The circumference of the circle "+ b);
    }
}




public class Circle {
    public static void main(String[] args) {

        int r;

        Scanner input = new Scanner(System.in);
        r = input.nextInt();

        Arpri.Area(r);
        Arpri.Circumference(r);
    }
}
