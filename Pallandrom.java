import java.util.*;

public class Pallandrom {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the number");
       int x=sc.nextInt();
       int n=x,a=0;
       while (n>0){
          n=n/10;
       }
       if (a==x){
        System.out.println(" palindrom");
       }
       else{
        System.out.println("not a palindrom");
       }
    }
}