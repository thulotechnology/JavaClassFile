public class AddCalculator {
    public static void main(String[] args) {
        add(10.2,20);
        add(10,20,20);
    }
//Create a 2 method multiply which multiply 2 or 3 numbers
    public static void add(double n1, int n2){
        double total = n1 +n2;
        System.out.println("Total is "+total);
    }

    public static void add(int n1, int n2, int n3){
        int total = n1 + n2 + n3;
        System.out.println("Total is "+total);
    }
}
