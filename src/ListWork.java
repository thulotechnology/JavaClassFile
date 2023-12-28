import java.util.ArrayList;
import java.util.Collections;

public class ListWork {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Shahi");
        names.add("Ganesh");
        names.add("Istar");
        names.add("Bishworaj");

        Collections.sort(names, Collections.reverseOrder());

    for (String name: names){
        System.out.println(name);
    }

    }
}
// Print Name in Ascending Order.
