import java.util.Scanner;

public class Natural {
    public static void numbers(int n)
    {
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            sum = sum+i;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        numbers(a);
    }
}
