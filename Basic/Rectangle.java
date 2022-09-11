import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle--> ");
        float length = input.nextFloat();
        System.out.print("Enter the breadth of the rectangle--> ");
        float breadth = input.nextFloat();

        float Area = length*breadth;
        float Perimeter = 2*(length+breadth);

        System.out.println("The area of the rectangle is--> "+ Area);
        System.out.println("The perimeter of the rectangle is--> "+ Perimeter);

    }
}
