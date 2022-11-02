import java.util.Scanner;

public class Palindrome {
    public static void check(int num)
    {
        int numb = num;
        int r = 0;
        int mun = 0;
        while(numb != 0)
        {
            r = numb%10;
            mun = (mun*10)+r;
            numb /= 10;
        }
        if (mun == num)
        {
            System.out.println(num +" is palindrome number");
        }
        else
        {
            System.out.println(num +" is not an palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        check(num);
    }
}
