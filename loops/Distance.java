import java.util.Scanner;

public class Distance {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates of point A--> ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter the coordinate sof point B--> ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        double sqx = Math.pow((x2-x1),2);
        double sqy = Math.pow((y2-y1),2);

        double dist = Math.sqrt(sqx+sqy);

        System.out.print("The distance between point A and B is--> "+ dist);
    }
}
