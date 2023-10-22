import java.util.Scanner;

public class Hollow_square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Square Size: ");
        int size = sc.nextInt();
        sc.close();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size)
                    System.out.print("* ");
                else if (i >= 2 && i <= size-1)
                    if (j >= 2 && j <= size-1)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
            }
            System.out.println();
        }
    }
}

