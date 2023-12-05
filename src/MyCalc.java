import java.util.Scanner;
// Write a program that find age from DOB using exception handling.
public class MyCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try{
           System.out.println("Enter first number: ");
           int n1 = sc.nextInt();

           System.out.println("Enter second number: ");
           int n2 = sc.nextInt();

           int sum = n1 + n2;

           System.out.println("Total is "+sum);
       }catch (Exception e){
           System.out.println("You must enter number.");
       }finally {
           System.out.println("Done");
       }
    }
}


