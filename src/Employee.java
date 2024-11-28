public class Employee {
    String name;
    int id;
    boolean attendance=false;
    int normalWorkday=8;
    int salperhour=20;
    double dailySalary=0;
    int monthworkday=20;
    double MonthlySalary=0;

    public void attendence(boolean a) {
        attendance=false;
        if(a){
            attendance=true;
            System.out.print(" employee is present " );
        }
        else{
            System.out.print(" employee is absent " );
        }
    }

    public void calDailyWage(int i){
        dailySalary=0;
        if(attendance){
            dailySalary=normalWorkday*salperhour;
            System.out.println(" Salary for day "+(i+1)+" is: "+dailySalary);
        }
        else{
            dailySalary=0;
            System.out.println(" Salary for day "+(i+1)+" is: "+dailySalary);
        }
    }

    public void calMonthlyWage(){
        MonthlySalary+=dailySalary;
    }

    Employee(String n,int a){
        this.name=n;
        this.id=a;
    }

}
