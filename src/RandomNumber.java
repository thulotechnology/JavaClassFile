public class RandomNumber {
    public static void main(String[] args) {
        int[] randoms = {getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber()};

        System.out.println(randoms[0]);
        System.out.println(randoms[1]);
        System.out.println(randoms[2]);
        System.out.println(randoms[3]);
        System.out.println(randoms[4]);
        System.out.println(randoms[5]);
    }

    public static int getRandomNumber(){
        int random = (int)Math.floor(Math.random()*6)+1;
        return random;
    }
}
// Provide random number between 50-100
