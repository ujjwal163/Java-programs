import java.util.Scanner;
public class variable_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        x = (x * y) ;
        y = x/y;
        x = x/y;
        System.out.print(x + " " + y);
    }
}
