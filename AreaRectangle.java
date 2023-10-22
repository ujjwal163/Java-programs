import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int x = sc.nextInt();
        System.out.println("Enter a breadth: ");
        int y = sc.nextInt();
        sc.close();
        System.out.println("Area of rectangle is "+(x * y));
    }
}
