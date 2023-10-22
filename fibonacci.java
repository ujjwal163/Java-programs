import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms: ");
        int x = sc.nextInt();
        sc.close();
        int i;
        int p = 0;
        int q = 1;
        System.out.print("0");
        System.out.print(" 1");
        for(i=0;i<x-2;i++)
        {
            int s=0;
            s = p + q;
            p = q;
            q = s;
         System.out.print(" "+s);
        }
    }
}
