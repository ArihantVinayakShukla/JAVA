import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the parallelogram--> ");
        int height = input.nextInt();
        System.out.print("Enter the base of the parallelogram--> ");
        int base = input.nextInt();

        int Area = base*height;
        System.out.println("The area of the parallelogram is--> "+ Area);

        int Perimeter = 2*(height+base);
        System.out.println("The perimeter of the parallelogram is--> "+ Perimeter);
    }
}
