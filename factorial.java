import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int n, fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
          fact=fact*i;
          System.out.println("the factorial is"+fact);
          sc.close();
        }
    }
}