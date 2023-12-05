public class Works {
    public static void main(String[] args) {
        int[] pushUpinWeek = {10,15,20,11,15,14,13};

        int total = 0;

        for(int i=0; i<pushUpinWeek.length; i++ ){
            total = total + pushUpinWeek[i];
        }

        System.out.println("Total push up in week: "+total);
    }
}
