import java.util.Scanner;

public class drivingtest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age= sc.nextInt();
        if(age>18){
        System.out.println("can drive");
       
        }
        else if(18>age && age<50)
        {

        System.out.println("can drive");
        }
        else
        System.out.println("cannot drive");
    }

}
