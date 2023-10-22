import java.util.Scanner;

public class print_even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int x = sc.nextInt();
        sc.close();
        int i = 1;
        System.out.println("Even numbers:");
        while (i <= x) {
            if (i % 2 == 0)
                System.out.print(" " + i);
            i++;
        }
        System.out.println();
        System.out.println("Odd numbers:");
        i = 1;
        while (i <= x) {
            if (i % 2 != 0)
                System.out.print(" " + i);
            i++;
        }
    }
}
