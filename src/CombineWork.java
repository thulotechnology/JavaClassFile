public class CombineWork {
    public static void main(String[] args) {
        String[] countries = {"Nepal", "US", "India", "ABC", "ABC"};
        String[] countries2 = {"UK", "Japan", "China"};

        String[] allCountyries = new String[countries.length+ countries2.length];

        // For countries
        for(int i=0; i< countries.length; i++){
            allCountyries[i] = countries[i];
        }

        // For countries2
        for(int i = countries.length; i< countries.length+ countries2.length; i++){
            allCountyries[i] = countries2[i-countries.length];
        }

        // Display All Countries
        for(String country: allCountyries){
            System.out.println(country);
        }
    }
}
