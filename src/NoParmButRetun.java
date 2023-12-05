public class NoParmButRetun {
    public static void main(String[] args) {
      printEven(5,10);
    }

//Write a program in Java to print even numbers between intervals using methods.
    public static void printEven(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
