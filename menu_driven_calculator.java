import java.util.Scanner;
public class menu_driven_calculator {
    public static void main(String[] args) {
        System.out.println("Menu Driven Program");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice: ");
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("Enter two numbers=");
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();
                System.out.println("Sum is " + (a + b));
                break;
            }
            case 2: {
                System.out.println("Enter two numbers=");
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();
                System.out.println("Subtraction is " + (a - b));
                break;
            }
            case 3: {
                System.out.println("Enter two numbers=");
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();
                System.out.println("Product is " + (a * b));
                break;
            }
            case 4: {
                System.out.println("Enter two numbers=");
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();
                System.out.println("Division is " + (a / b));
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
    
}
