public class MaxNumberFunc {
    public static void main(String[] args) {
        System.out.println(generateRandomNumber(1,10));
    }

    // function that returns random number between range
    public static int generateRandomNumber(int min, int max){
        int random = (int)(Math.random() * (max - min + 1) + min);
        return random;
    }
}
