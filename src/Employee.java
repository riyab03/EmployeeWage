import java.util.Random;
import java.util.Scanner;

//EmpWageBuilder has array of many
//CompanyEmpWage Object
class EmpWageBuilder{
    int n,i=0;
    Employee[] companies;

    EmpWageBuilder(int n){
        this.n=n;
        companies=new Employee[n];
        this.i=0;
    }

    public void addCompany(String name,int sal,int mon,int mHours){
        companies[i++]=new Employee(name,sal,mon,mHours);
    }

    public  void ComputeWage(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        do {
            System.out.println("Enter Company name");
            String name=sc.next();
            System.out.println("Enter salary per hour");
            int salperhour=sc.nextInt();
            System.out.println("Enter number of working days per month");
            int monthworkday=sc.nextInt();
            System.out.println("Enter total working hours");
            int maxHours=sc.nextInt();
            addCompany(name,salperhour,monthworkday,maxHours);
            companies[i].compute();
            i++;
        }while(i<n);
    }

}



public class Employee {
    Scanner sc=new Scanner(System.in);
    String name;  //Employee name
    boolean attendance;//Employee attendance: true/false
    int normalWorkday=0;//number of daily work day
    int salperhour=20;//Salary per Hour
    double dailySalary=0; //Daily Salary
    int monthworkday=20; //number of working days per month
    int maxHours=100;//total working hours

    int workingHours=0;
    int wageTillCon=0;
    int totalWage=0;
    int totalHours=0;

    //method for taking input : name,id,sal per hr,working days/month,total working days
    Employee(String name,int sal,int mon,int mHours){
        this.name=name;
        this.salperhour=sal;
        this.monthworkday=mon;
        this.maxHours=mHours;
    }


    //method for recording attendance everyday
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

    //calculating daily wage
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


    //calculating wage till condition of total working hrs or days is reached for a month
    public void calWageTillCond(){
        wageTillCon=workingHours*salperhour;
        totalWage+=wageTillCon;
    }

    public void compute(){
        for(int tillHours=0,day=0;day<monthworkday && tillHours<=maxHours;day++,tillHours+=workingHours) {
            Random r = new Random();
            int a = (r.nextInt(1000)) % 3;
            switch (a) {
                case 1 ->{
                    attendence(true);
                    System.out.print(" Full time today: ");
                    normalWorkday = 8;
                    workingHours=8;
                }
                case 2 -> {
                    attendence(true);
                    System.out.print(" Part time today: ");
                    normalWorkday = 4;
                    workingHours=4;
                }
                default -> {
                    attendence(false);
                    workingHours=0;
                }
            }
            calDailyWage(day);
            calWageTillCond();
            totalHours=(tillHours+workingHours);
//            System.out.println(" total working hours till now :"+totalHours);
        }
        System.out.println("Total wage :"+totalWage);

    }
}
