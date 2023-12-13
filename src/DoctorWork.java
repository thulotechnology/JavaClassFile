public class DoctorWork {
    public static void main(String[] args) {
    Doctor d1 = new Doctor();
    d1.name = "Rabikanta";
    d1.department = "Head";
    d1.exparties= "Head Surgan";
    d1.setSalary(-60000);

        System.out.println(d1.getSalary());
    }
}

class Doctor{
    String name;
    String department;
    String exparties;
    private double salary;
    public Doctor(){
        this.salary = 40000;
    }

    double getSalary(){

        return this.salary;
    }

    void setSalary(double amount){
      if(amount>0){
          this.salary = amount;
      }else{
          System.out.println("Negative and 0 amount can't be save.");
      }
    }




}
