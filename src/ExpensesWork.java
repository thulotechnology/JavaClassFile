public class ExpensesWork {
    public static void main(String[] args) {
        double[] weeklyExpenses = {100,100,200,40,20, 20, 19};
        double total=0;
        // Find total weekly expenses
        for(double daily: weeklyExpenses){
            total = total+ daily;
        }
        System.out.println("Your total weekly expenses is "+total);

        // Find avg daily expenses
        double avg = total / weeklyExpenses.length;
        System.out.println("Your avg daily expenses is "+avg);
    }
}
