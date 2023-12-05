import java.io.FileWriter;
import java.util.Scanner;

public class ContactSaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter phone: ");
        String number = sc.nextLine();

        // Save it to File
        try{
            FileWriter fw = new FileWriter("contact.csv",true);
            fw.write(name+ ","+number+"\n");
            fw.close();
            System.out.println("Contact "+name + " is successfully saved.");
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }

    }
}
// Daily Income Expenses Saver
//[title, income, category, date] [income.csv]
//[title, expenses, category, date] [expenses.csv]

// Contact with [name, email, phone]
