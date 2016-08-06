import java.util.Scanner;
public class Session3Assignment1
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       int num;
     
       System.out.print("Enter an integer number: ");
       num = sc.nextInt();
     
       System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
       System.out.println("Cube Root of "+ num + " is: "+ Math.cbrt(num));
    }
}
        