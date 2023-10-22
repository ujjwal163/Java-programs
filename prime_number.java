import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        int i;
        for(i=2;i<x;i++)
        {
            if (x % i == 0)
                break;
        }
        if(i==x)
            System.out.println("Prime Number");
        else
        System.out.println("Not Prime Number");
    }
}

