//Temperature Converter: Write a program that converts temperatures between Fahrenheit and Celsius
//The user should be able to choose the input and output scales, 
//and the program should perform the conversion accordingly.
import java.util.Scanner;
public class Temperature_converter {
    public static void main(String[] args) {
        //(0°C × 9/5) + 32 = 32°F
        //(32°F − 32) × 5/9 = 0°C

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Celsius Scale to Fahrenheit Scale");
        System.out.println("Enter 2 to convert Fahrenheit Scale to Celsius Scale");
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println("Enter the temperature: ");
        float y = sc.nextFloat();
        float z;
        sc.close();
        if (x == 1) //C to F
        {
            z = (y * 1.8f) + 32;
            System.out.format("Temperature in Fahrenheit is= %.2f", z); //upto 2 d.p.
        } 
        else      //F to C
        { 
            z = (y - 32) * 0.56f;
            System.out.format("Temparature in Celcius is= %.2f",z);
        }
    }
}
/*A double is a floating point number with double precision,
 a float is a floating point number with single precision. 
 If you just write 0.5 then it is interpreted as a double. 
 To use the float type you have to write it as 0.5f*/
