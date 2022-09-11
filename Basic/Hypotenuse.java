import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle--> ");
        double base = input.nextFloat();
        System.out.print("Enter the perpendicular of the triangle--> ");
        double perpendicular = input.nextFloat();

        double Hypotenuse = Math.sqrt((base*base)+(perpendicular*perpendicular));

        System.out.println("The Hypotenuse of the triangle is--> "+ Hypotenuse);
    }
}