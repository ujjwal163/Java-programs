import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println("Area of circle is "+(3.14*x*x));
    }
}
