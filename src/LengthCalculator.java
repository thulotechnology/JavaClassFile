import java.util.Scanner;

public class LengthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();

        int length = word.length();

        System.out.println("The length of "+word + " is "+length+".");

    }
}
