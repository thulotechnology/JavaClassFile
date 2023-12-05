public class VowelFind {
    public static void main(String[] args) {
        String word = "F";

        switch (word.toLowerCase()){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u" :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");
        }
    }
}
