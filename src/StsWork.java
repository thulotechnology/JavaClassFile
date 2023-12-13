public class StsWork {
    public static void main(String[] args) {
        Student s1 = new Student("Istar", 30, 100);
        Student s2 = new Student("Shashi", 20, 90);
        Student s3 = new Student("Ganesh", 25, 95);
        s1.display();
        s2.display();
        s3.display();


    }
}

class Student{
   private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    void display(){
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
        System.out.println("Mark is "+this.mark);
        System.out.println("--------------------------");
    }
}
