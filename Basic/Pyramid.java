import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base length of the pyramid--> ");
        int length = input.nextInt();

        System.out.print("Enter the base width of the pyramid--> ");
        int width = input.nextInt();

        System.out.print("Enter the height of the pyramid--> ");
        int height = input.nextInt();

        int Volume = (height*width*length)/3;
        System.out.println("The volume of the pyramid is--> "+ Volume);
    }
}
