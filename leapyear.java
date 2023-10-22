import java.util.Scanner;

public class leapyear{
    public static void main(String[]args){
        int m;
        System.out.println("ENTER THE YEAR");
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();

        if(m%100==0 && m%400==0 ) 
        {
            System.out.println("leap year");
        }
        else if (m%100!=0 && m%4==0)
        {
            System.out.println(" leap year");
        } 
        else ;
        { 
          System.out.println("not a leap year");
        }
    }
}