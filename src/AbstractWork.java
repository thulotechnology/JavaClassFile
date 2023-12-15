public class AbstractWork {
    public static void main(String[] args) {
    DimondSchoolStudent ds = new DimondSchoolStudent();
    ds.enrollSubjects();
    }
}

abstract class Sts{
    abstract void enrollSubjects();

}

class DimondSchoolStudent extends Sts{
    void enrollSubjects(){
        System.out.println("Enrolling student....");
    }
}

