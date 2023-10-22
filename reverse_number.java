import java.util.Scanner;
//import java.io.*;
public class reverse_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        int a = 0;
        while(x!=0)
        {
            int y = x % 10;
            a=a*10+y;
            x = x / 10;
        }
        System.out.println("Reverse number is "+a);
    }
}

