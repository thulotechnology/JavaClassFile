public class FunctionWork {
    public static void main(String[] args) {
  int bY=  calculateBirthYear(23);
  bY-=2;
        System.out.println("Birth Year is: "+bY);
    }

    public static int calculateBirthYear(int age){
        int birthYear = 2023-age;
        return birthYear;
    }
}

