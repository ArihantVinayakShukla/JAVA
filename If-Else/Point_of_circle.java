import java.util.Scanner;

public class Point_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the radius of the Circle--> ");
        int Radius = input.nextInt();
        System.out.print("Enter the first coordinate of point--> ");
        int first = input.nextInt();
        System.out.print("Enter the second coordinate of point--> ");
        int second = input.nextInt();

        System.out.print("Enter the first coordinate of centre--> ");
        int x = input.nextInt();
        System.out.print("Enter the second coordinate of centre--> ");
        int y = input.nextInt();

        Double Distance = Math.sqrt(((x-first)*(x-first)) + ((y-second)*(y-second)));
        System.out.println("The Distance is--> "+ Distance);

        if(Distance>Radius)
        {
            System.out.println("Point is outside the circle");
        }
        else if(Distance<Radius)
        {
            System.out.println("point is inside the circle");
        }
        else
        {
            System.out.println("point is on the circle");
        }
    }
}
