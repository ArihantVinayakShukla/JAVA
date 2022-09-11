import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the square--> ");
        int side = input.nextInt();

        int Area = side*side;
        int Perimeter  = 4*side;

        System.out.println("The area of the square is--> "+ Area);
        System.out.println("The perimter of the square is--> "+ Perimeter);
    }
}
