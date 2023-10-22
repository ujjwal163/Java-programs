import java.util.Scanner;

public class menucalculator {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner r=new Scanner(System.in);
        System.out.println("This is CALCULATOR....");
        System.out.println("Enter any two numbers =");
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("1.Addition(+) \n 2.Subtraction(-) \n 3.Multiplication(*) \n 4.Division(/) \n 5.Modulus(%)");
        ch=r.nextInt();

        switch(ch)
        {
            case 1: System.out.println("Total is ="+(a+b)); 
            break;

            case 2: System.out.println("Total is ="+(a-b));
            break;

            case 3: System.out.println("Total is ="+(a*b)); 
            break;

            case 4: System.out.println("Total is ="+(a/b)); 
            break;

            case 5: System.out.println("Total is ="+(a%b)); 
            break;

            default: System.out.println("Error");
            
        }
        r.close();
    }
}
