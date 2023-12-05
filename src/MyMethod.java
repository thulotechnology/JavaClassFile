public class MyMethod {
    public static void main(String[] args) {
    // Calling Method
     printName();
    }
    // Write a method that that display your address.
    // Give method name as displayName(){}
    // Here method name is printName
    public static void printName(){
        System.out.println("Ganesh");
        printName2();
    }
    public static void printAnotherName(){
        System.out.println("Shashi");
    }

    public static void printName2(){
        System.out.println("Istar");
        printAnotherName();
    }
}



