import java.util.Scanner;
public class even_odd 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();
        System.out.println(x%2==0?"Even":"Odd");
    }  
}
