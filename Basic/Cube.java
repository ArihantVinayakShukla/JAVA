import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the cube--> ");
        int side = input.nextInt();

        int Surface_Area = 6*(side*side);
        System.out.println("The total surface area of cube is--> "+ Surface_Area);
    }
}
