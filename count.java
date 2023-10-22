import java.util.Scanner;
public class count{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        int a=0;
        while(x!=0)
        {
            x = x / 10;
            a++;
        }
        System.out.println("Number of digits is "+a);
    }
}
