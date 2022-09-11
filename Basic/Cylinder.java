import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder--> ");
        int radius = input.nextInt();

        System.out.print("Enter the height of the cylinder--> ");
        int height = input.nextInt();

        double Volume = 3.14*(radius*radius)*height;
        System.out.println("The volume of the cylinder is--> "+ Volume);

        double Curved_Area = 2*3.14*radius*height;
        System.out.println("The curved surface area of the cylinder is--> "+ Curved_Area);
    }
}