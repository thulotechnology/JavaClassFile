package PersonalFinance;

public class InheritanceWork {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Istar";
        p.age = 30;
        p.height = 5.0;


        Teacher teacher = new Teacher();
        teacher.name = "Mahesh";
        teacher.age = 29;
        teacher.height = 34;
        teacher.salary = 2555;

        Student s1 = new Student();
        s1.name = "Sita";
        s1.age = 21;
        s1.rollNo =25;
        s1.height = 5.2;



    }

}

class Person{
    String name;
    int age;
    double height;
}

class Teacher extends Person {
double salary;

}

class Student extends Person{
int rollNo;
}
