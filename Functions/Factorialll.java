import java.util.Scanner;

public class Factorialll {
    public static void factorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        factorial(num);
    }
}