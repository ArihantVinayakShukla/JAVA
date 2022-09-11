import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle--> ");
        float radius = input.nextFloat();

        double Area = 3.14*(radius*radius);
        double Circumference = 2*3.14*radius;

        System.out.println("The area of the circle is--> "+ Area);
        System.out.println("The circumference of the circle is--> "+ Circumference);
    }
}