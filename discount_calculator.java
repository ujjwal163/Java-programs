import java.util.Scanner;
public class discount_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of your purchase: ");
        float x = sc.nextInt();
        sc.close();
        float y;
        System.out.println("After Discount:");
        if(x>=1000 && x<5000)
        {
            y = (x * 5) / 100;
            System.out.format("Amount to be paid= %.2f", x - y);
        }
        else if(x>=5000&&x<10000)
        {
            y = (x * 10) / 100;
            System.out.format("Amount to be paid= %.2f", x - y);
        }
        else if(x>20000)
        {
            y = (x * 25) / 100;
            System.out.format("Amount to be paid= %.2f", x - y);
        }
        else if(x>=10000&&x<=20000)
        {
            y = (x * 15) / 100;
            System.out.format("Amount to be paid= %.2f", x - y);
        }
        
    }
}
/* 
Discount Calculator: Create a program that calculates the discount amount for a customer's purchase
based on their total bill and a set of discount rules.
Apply different discounts based on the purchase amount.
Also print the bill recipt on the output screen.

1k-5k then 5% off
5k-10k then 10% off
Anything above 20k then 25%off
10-20k- then 15% off       */