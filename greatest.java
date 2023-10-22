import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        System.out.print("Greatest number is:");
        System.out.println(x > y && y > z ? x : y > z ? y : z);
    }
}
