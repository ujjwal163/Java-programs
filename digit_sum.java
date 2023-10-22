import java.util.Scanner;
public class digit_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        int sum = 0;
        int a = 0;
        while(x!=0)
        {
            a = x % 10;
            x = x / 10;
            sum = a + sum;
        }
        System.out.println("Sum of numbers is "+sum);
    }
}

