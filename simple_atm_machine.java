import java.util.Scanner;

public class simple_atm_machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money deposited: ");
        int x = sc.nextInt();
        System.out.println("1.Deposited money");
        System.out.println("2.Withdraw money");
        System.out.println("3.Your Balance");
        System.out.println("Enter your choice: ");
        int y = sc.nextInt();
        
        int a = 0;
        switch (y) {
            case 1: {
                System.out.println("Your deposited money is " + x);
            }
            case 2: {
                System.out.println("Enter the money to be withdraw");
                int p = sc.nextInt();
                sc.close();
                if (p > x)
                    System.out.println("Your account has amount: " + x);
                else
                {
                    a = x - p;
                    x = a;
                }
            }
            case 3: {
                System.out.println("Your balance is " + x);
            }
        }
    }
}
