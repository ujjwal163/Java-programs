import java .util.*;
public class rohmbus {
    public static void main(String[] args) {
        System.out.println("enter the n");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int k =0;k<i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
