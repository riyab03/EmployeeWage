public class Employee {
    String name;
    int id;
    boolean attendance;
    int normalWorkday=0;
    int salperhour=20;
    double dailySalary=0;
    int monthworkday=20;
//    double MonthlySalary=0;
    int maxHours=100;
    int workingHours=0;
    int wageTillCon=0;
    int totalWage=0;
    int totalHours=0;

    public void attendence(boolean a) {
        if(a){
            attendance=true;
            System.out.print(" employee is present " );
        }
        else{
            attendance=false;
            System.out.print(" employee is absent " );
        }
    }

    public void calDailyWage(int i){
        if(attendance){
            dailySalary=normalWorkday*salperhour;
            System.out.print(" Salary for day "+(i+1)+" is: "+dailySalary);
        }
        else{
            dailySalary=0;
            System.out.print(" Salary for day "+(i+1)+" is: "+dailySalary);
        }
    }

//    public void calMonthlyWage(){
//        MonthlySalary+=dailySalary;
//    }

    public void calWageTillCond(){
        wageTillCon=workingHours*salperhour;
        totalWage+=wageTillCon;
    }


    Employee(String n,int a){
        this.name=n;
        this.id=a;
    }

}
