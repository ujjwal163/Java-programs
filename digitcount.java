import java.util.*;

public class digitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit");
        int num =sc.nextInt();
        int count = 0; 
        while (num!=0){
            num=num/10;
            count++;
        }
        System.out.println("this is the count of the number"+count);
        sc.close();
        
    }
}
