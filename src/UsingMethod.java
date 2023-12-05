import java.util.Scanner;

public class UsingMethod {
    public static void main(String[] args) {
        int vCount=0;
        int cCount=0;

        String vString="";
        String cString= "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");

        String word = sc.nextLine().toLowerCase().replace(" ","");

        // Word Length
        int wordLength = word.length();
        System.out.println(wordLength);

        for(int i =0; i<wordLength; i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch== 'e' || ch=='i' || ch == 'o' || ch=='u'){
                vCount++;
                vString += ch+", ";

            }else{
                cCount++;
                cString += ch+", ";
            }
        }

        System.out.println("Total No of Vowels: "+vCount);
        System.out.println("Vowels: "+vString.substring(0, vString.length() - 2));

        System.out.println("Total No of Consonents: "+cCount);
        System.out.println("Consonets: "+cString.substring(0, cString.length() - 2));
    }

}
