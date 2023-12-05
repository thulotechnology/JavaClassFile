package PersonalFinance;

import java.io.FileWriter;

enum Category{Income,Expenses}

public class Main {
    public static void main(String[] args) {

    }

    public static void saveIncomeExpenses(Category cat, double amount, String category, String date){
        if(cat == Category.Income){
            // Income Code
            try{
                FileWriter myWriter = new FileWriter("income.csv",true);
                myWriter.write("Wow, I wrote something on file.!");
                myWriter.close();
                System.out.println("Write to file successful.");
            }catch (Exception ex){

            }
        }else{
            // Expenses Code
            try{
                FileWriter myWriter = new FileWriter("expenses.csv", true);
                myWriter.write("Wow, I wrote something on file.!");
                myWriter.close();
                System.out.println("Write to file successful.");
            }catch (Exception ex){

            }
        }
    }


}
