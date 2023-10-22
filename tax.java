import java.util.*;

public class tax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount");
         int sal =sc.nextInt();
        if(sal<=10000){
            System.out.println(sal);
        }
        
        else if(sal>10000 && sal<=20000)
        {
             int tax=(sal*10/100);
             sal=sal-tax;
            System.out.println(sal);
        }
        else if (sal>20000 && sal<30000){
            int tax=(sal*15/100);
            sal=sal-tax;
            System.out.println(sal);
        }
        else if (sal>=30000){
            int tax=(sal*25/100);
            sal=sal-tax;
            System.out.println(sal);
        }
        else{
            System.out.println("worng amount");
        }
    }
}
