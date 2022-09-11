import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the length of the prism--> ");
        int length=  input.nextInt();
        System.out.print("Enter the width of the prism--> ");
        int width = input.nextInt();

        int Base_Area = length*width;
        System.out.println("Base Area = "+ Base_Area);

        System.out.print("Enter the height of the prism--> ");
        int height = input.nextInt();

        int Volume = Base_Area * height;
        System.out.println("The volume of the prism is--> "+ Volume);
    }
}
