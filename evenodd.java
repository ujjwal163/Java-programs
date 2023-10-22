import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE RANGE");
       a=sc.nextInt();
       b=sc.nextInt(); 
       System.out.println("even range series ");
         
       for (int i=0;i<=b;i++){
        if(i%2==0){
            System.out.println(i+"");
        }
       }
      System.out.println("odd");
      for(int i=a;i<b;i++){
      if(i%2!=0){
        System.out.println(i+"");

      }
      }
      sc.close();

    }
}
