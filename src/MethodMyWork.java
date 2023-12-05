public class MethodMyWork {
    public static void main(String[] args) {
    displayName();
        displayFullName("Rahul","Sharma");
        displayFullName("Mohit","Nepali");
    }
    // Type 1 Method: No Parameter & No Return Type
    // Type 2 Method: Parameter & No Return Type

    public static void displayName(){
        System.out.println("Hello I am from US.");
    }

    // Here fName and lName are parameters
    // Here void means No Return Type
    public static void displayFullName(String fName, String lName){
        System.out.println("Your full name is "+ fName+ " "+ lName);
    }
}
