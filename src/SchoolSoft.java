public class SchoolSoft {
    public static void main(String[] args) {
        St.school = "ABC School";
        St s1 = new St("Bimal","12");
        St s2 = new St("Sonu","13");
        St s3 = new St("Sonika","14");
        System.out.println(St.school);
    }
}

class St{
   String name;
   String roll;
 static String school;

    public St(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }
}
