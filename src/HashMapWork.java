import java.util.HashMap;
public class HashMapWork {
    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<String, String>();
        countryCapital.put("Nepal","Kathmandu");
        countryCapital.put("USA","WDC");
        countryCapital.put("Japan", "Tokyo");

        System.out.println(countryCapital.get("Nepal"));


       for(String country: countryCapital.keySet()){
           System.out.println(countryCapital.get(country));
       }


    }
}
// Create a Hashmap of String and Double that store, name and price of 4 Laptop
// Display all the price.