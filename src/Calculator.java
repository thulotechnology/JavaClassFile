import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // int: It stores number without decimal point for. e.g 1, 2, -10
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter last Number: ");
        int num2 = sc.nextInt();

        // Find total
        int total = num1 + num2;
        System.out.println("Total is: "+total);

    }
}
// Write a Java Program to Find Difference....