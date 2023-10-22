import java.util.Scanner;

//
public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        int a = 0;
        int s = x;
        while (x != 0) {
            x = x / 10;
            a++;
        }
        x = s;
        int i;
        for (i = 0; i < (a / 2); i++) {
            int first = 1;
            for (int j = 0; j < a - i - 1; j++) {
                first = first * 10;
            }
            int p = x / first;
            for (int k = 0; k < i; k++) {
                x = x / 10;
            }
            int last = x % 10;
            x = x - first;

            if (p != last) {
                System.out.println("Not palindrone number");
                break;
            }
        }
        x = a / 2;
        if (x == i)
            System.out.println("Palindrone number");
    }
}
