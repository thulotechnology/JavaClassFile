import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create Object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName= sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " "+ lastName;

        System.out.println("Hello "+fullName+ ", How are you?");

    }
}
// Write a program that display your address using user input.