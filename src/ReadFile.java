import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        double amount = 0;
        try {
            File myObj = new File("income.csv");
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String mydata = reader.nextLine();
                String[] data = mydata.split(",");
                amount += Double.parseDouble(data[1]);

            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

        System.out.println("Total Amount is: "+amount);
    }
}
// Write a Program that read content from income.txt