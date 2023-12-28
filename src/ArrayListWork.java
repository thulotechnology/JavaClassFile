import java.util.ArrayList;

public class ArrayListWork {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Nepal");
        countries.add("USA");
        countries.add("Japan");
        countries.add("China");

        System.out.println(countries.size());

        // Print
        for(String country: countries){
            System.out.println(country);
        }

    }
}
// Create arraylist of 5 fruits and print each fruit.