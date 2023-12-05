public class MyWorkMethod {
    public static void main(String[] args) {
        displayLength("Hello");
        displayLength("Hii");
        displayLength("See you");
    }
    // Method that print text length
    public static void displayLength(String w){
        int length = w.length();
        System.out.println("The length of word is "+length);
    }
}

// Create a function that accept 2 parameter i.e name and age
// Display output like Hello Ram, you are born on year 1990.
