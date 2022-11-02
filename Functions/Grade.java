import java.util.Scanner;

public class Grade {
    public static void marks(int m)
    {
        if(m>=91 && m<=100)
        {
            System.out.println("GRADE--> AA");
        }
        else if(m>=81 && m<=90)
        {
            System.out.println("GRADE--> AB");
        }
        else if(m>=71 && m<=80)
        {
            System.out.println("GARDE--> BB");
        }
        else if(m>=61 && m<=70)
        {
            System.out.println("GRADE--> BC");
        }
        else if(m>=51 && m<=60)
        {
            System.out.println("GRADE--> CD");
        }
        else if(m>=41 && m<=50)
        {
            System.out.println("GRADE--> DD");
        }
        else
        {
            System.out.println("FAIL");
        }
    }

    public static int zero()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter The number");
       int score = in.nextInt();
       while(score<0||score>100){
            System.out.println("You Entered the wrong number , Enter The number Again :");
            score = in.nextInt();
       }
        return score;
    }

    public static void main(String[] Args)
    {
        int m = Grade.zero();
        Grade.marks(m);
    }
}
