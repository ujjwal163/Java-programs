import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        sc.close();
        arm(n);
    }

    static void arm(int a) {
        int p = power(a);
        if (p == a)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }

    static int count_digit(int a) {
        int count = 0;
        while (a != 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    static int power(int a) {
        int i, count, sum = 0, s = 1;
        count = count_digit(a);
        for (i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++)
                s = s * (a % 10);
            sum = sum + s;
            a = a / 10;
            s = 1;
        }
        return sum;
    }
}
