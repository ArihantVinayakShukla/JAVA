import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the radius of the sphere--> ");
        double radius = input.nextDouble();

        double Volume = (4.0/3.0)*3.14*(radius*radius*radius);
        System.out.println("The volume of the sphere is--> "+ Volume);
    }
}
