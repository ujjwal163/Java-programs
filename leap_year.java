//Leap Year: Write a program that checks if a given year is a leap year. 
//A leap year is divisible by 4, but not divisible by 100 unless it is also divisible by 400.

import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int x = sc.nextInt();
        if (x % 4 == 0) {
            if (x % 100 == 0) {
                if (x % 400 == 0)
                    System.out.println("Leap year");
                else
                    System.out.println(("Not Leap Year"));
            } 
             else
                System.out.println("Leap Year");
        } 
        else {
            System.out.println("Not Leap Year");
        }
        sc.close();
    }
}
