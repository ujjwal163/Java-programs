
import java .util.*;
public class tringlepattern {
    public static void main(String[] args) {
        System.out.println("enter the n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i;j++)
            System.out.print("*");
        System.out.println();}
    }
}
