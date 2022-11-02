import java.util.Scanner;

 class num
{
    public static void eveodd (int a)
    {
        if (a%2==0)
        {
            System.out.println(a +" is even.");
        }
        else
        {
            System.out.println(a+ " is odd.");
        }
    }
}

public class EvenOdd {
    public static void main(String[] Args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        num.eveodd(a);
    }
}
