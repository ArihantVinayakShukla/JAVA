import java.util.Scanner;

public class Product {

    public static void var(int a, int b)
    {
        int i = a*b;

        System.out.println("The product is " + i);
    }

    public static void main(String[] Args)
    {
        int a, b;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        var(a,b);
    }
}
