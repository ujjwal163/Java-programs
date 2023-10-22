import java.util.Scanner;

public class Mirror_Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Square Size: ");
        int size = sc.nextInt();
        sc.close();
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= size; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
