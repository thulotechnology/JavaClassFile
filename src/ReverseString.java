public class ReverseString {
    public static void main(String[] args) {
        String rev = reverseText("Shashi");
        String rev2 = reverseText("Istar");
        String rev3 = reverseText("Ganesh");

        System.out.println(rev);
        System.out.println(rev2);
        System.out.println(rev3);
    }

    public static String reverseText(String text){
        String reverseName = "";
        int length= text.length();

        for(int i=length-1; i>=0; i--){
            reverseName += text.charAt(i);
        }
        return  reverseName;
    }

}


