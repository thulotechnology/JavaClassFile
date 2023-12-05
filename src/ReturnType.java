public class ReturnType {
    public static void main(String[] args) {
    int total = add(10,20,20);
    total = total+20;
        System.out.println(total);
    }
    public static int add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }

}
