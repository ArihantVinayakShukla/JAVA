import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number--> ");
        int num = input.nextInt();
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
}
