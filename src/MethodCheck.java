public class MethodCheck {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            isOddOrEven(i);
        }
        hello();
    }

    public static void hello(){
        isOddOrEven(20);
    }

    public static void isOddOrEven(int num){
        if(num%2 == 0){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
    }
}
