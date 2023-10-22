import java.util.*;

public class discount {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT");
        int dis =sc.nextInt();
        if(dis>=1000 && dis<=5000) {
           int off=(dis*5/100) ;
           dis=dis-off;
           System.out.println(dis);
        }
        else if(dis >5000 && dis <= 10000){
            int off=(dis*10/100);
            dis=dis-off;
            System.out.println(dis);
        }
        else if(dis>10000 && dis <= 20000){
              int off=(dis*15/100);
            dis=dis-off;
            System.out.println(dis); 
        }
        else if(dis >20000){
              int off=(dis*25/100);
            dis=dis-off;
            System.out.println(dis);
        }
        else{
            System.out.println("worng details");
        }
           
    }
}
