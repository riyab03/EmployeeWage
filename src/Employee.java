public class Employee {
    String name;
    int id;
    boolean attendance=false;
    int normalWorkday=8;
    int salperhour=20;
    double dailySalary=0;

    public void attendence(boolean a) {
        if(a){
            attendance=true;
            System.out.println("employee is present" );
        }
        else{
            System.out.println("employee is absent" );
        }
    }

    public void calculateWage(){
        if(attendance){
            dailySalary=normalWorkday*salperhour;
            System.out.println(dailySalary);
        }
        else{
            dailySalary=0;
            System.out.println(dailySalary);
        }
    }


    Employee(String n,int a){
        this.name=n;
        this.id=a;
    }

}
