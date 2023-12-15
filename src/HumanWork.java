enum Gender{Male,Female,Other}
public class HumanWork {
    public static void main(String[] args) {
        for(Gender g: Gender.values()){
            System.out.println(g);
        }
    }
}

class Human{
    String name;
    Gender gender;
}