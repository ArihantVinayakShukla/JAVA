import java.util.Scanner;

public class PrimeBetweenTwo {
    public static void Prime(int a, int b)
    {
        int flag;
        for (int i = a; i <= b; i++)
        {
            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (int j = 2; j <= i / 2; ++j)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        Prime(a,b);
    }
}
