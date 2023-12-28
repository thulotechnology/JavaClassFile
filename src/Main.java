import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object i.e salaries
        HashMap<String, Double> salaries = new HashMap<String, Double>();

        // Adding name and salary.
        salaries.put("Ram Sharma", 1100.0);
        salaries.put("Hari Sharma",1200.0 );
        salaries.put("Rocky Yadav", 2550.0);
        salaries.put("Menuka Pradhan", 1500.0);

        double totalSalary = 0;

        for (String name : salaries.keySet()) {
            System.out.println( name + " salary is : " + salaries.get(name));
            totalSalary+=salaries.get(name);
        }

        System.out.println("Total Salary is : "+totalSalary);
    }
}