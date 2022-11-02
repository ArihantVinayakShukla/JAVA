import java.util.Scanner;

public class MaxMin{
    public static int max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int min(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }


    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Maximum value is "+max(a,b,c));
        System.out.println("Minimum value is "+min(a,b,c));

    }
}