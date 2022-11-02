import java.util.Scanner;

public class Prime {
    public static void num(int a)
    {
        if (a==0 || a==1)
        {
            System.out.println("The number is not prime");
        }
        for(int i=2; i<a; i++)
        {
            if (a%i==0)
            {
                System.out.println("The number is not prime");
                break;
            }
        }
    }

    public static void main(String[] Args)
    {
        int a;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();

        Prime.num(a);
    }
}
