import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the triangle--> ");
        int side = input.nextInt();

        double Area = (1.732/4)*(side*side);

        System.out.println("The area of the equilateral triangle is--> "+ Area);
    }
}
