import java.util.Scanner;

public class LoopWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        // Print 50-100 using for loop.
        for(int i=1; i<=10; i++){
            System.out.println(i+ " * "+number + " = "+ i*number);
        }
    }
}
// Print Multiplication of 10