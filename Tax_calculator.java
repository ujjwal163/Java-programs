import java.util.Scanner;
public class Tax_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        int x = sc.nextInt();
        sc.close();
        if(x<10000)
            System.out.println("No Tax");
        else if(x>=10000&&x<20000)
        System.out.println("10% tax");
        else if(x>=20000&&x<30000)
        System.out.println("15% tax");
        else if(x>=30000)
        System.out.println("25% tax");
    
    }
}

