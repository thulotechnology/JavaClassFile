import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        int birthYear = 1990;

        int age = date.getYear() - birthYear;

        System.out.println("Your age is "+age);
    }
}
