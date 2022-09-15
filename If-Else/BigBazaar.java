import java.util.Scanner;

public class BigBazaar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total shopping amount--> ");
        float tot_Amount = input.nextFloat();

        if(tot_Amount>25000)
        {
            System.out.println("Your category is GOLD");
            double discount = tot_Amount*(0.20);
            double paid_amount = tot_Amount - discount;
            System.out.println("Your Amount to be paid after discount is--> "+ paid_amount);
        }
        else if(10000 < tot_Amount && tot_Amount < 25000)
        {
            System.out.println("Your category is SILVER");
            double discount = tot_Amount*(0.10);
            double paid_amount = tot_Amount-discount;
            System.out.println("Your Amount to be paid after discount is--> "+ paid_amount);
        }
        else
        {
            System.out.println("Your category is BRONZE");
            double discount = tot_Amount*(0.05);
            double paid_amount = tot_Amount-discount;
            System.out.println("Your Amount to be paid after discount is--> "+ paid_amount);
        }
    }
}