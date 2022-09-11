import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the height of the triangle--> ");
        int height = input.nextInt();
        System.out.print("Enter the base of the triangle--> ");
        int base = input.nextInt();

        double Area = 0.5* base* height;
        System.out.println("The area of the triangle is--> "+ Area);
    }
}
