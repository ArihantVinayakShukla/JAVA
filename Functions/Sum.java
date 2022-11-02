import java.util.Scanner;

public class Sum {

    public static void var(int a, int b)
    {
        int i = a + b;

        System.out.println("The sum is " + i);
    }

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        var(a, b);
    }
}
