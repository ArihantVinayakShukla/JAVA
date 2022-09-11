import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the cone--> ");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cone--> ");
        double height = input.nextDouble();

        Double Volume = (3.14*(radius*radius))*(height/3);

        System.out.println("The volume of the cone is--> "+ Volume);
    }
}
