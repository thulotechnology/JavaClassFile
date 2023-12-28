import java.time.LocalDate;

public class DateWorkNew {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // print only year
        System.out.println(ld.getYear());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfWeek());
    }
}
// Create age calculator that calculate age of person using user input.
// E.g
// Enter Your BirthYear: 1997
// Age = CurrentYear-1997
// Output: Your age is 26