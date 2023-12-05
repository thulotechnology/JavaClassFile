import java.util.Scanner;

public class UserInputWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);


        System.out.println("Enter your age: ");
        int age = sc.nextInt();


        System.out.println("Enter your name: ");
        String name = sc1.nextLine();


        int birthYear = 2023-age;
        System.out.println("Hello "+name+ ", your birth year is "+birthYear);
    }
}
