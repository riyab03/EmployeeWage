import java.util.Random;
import java.util.Scanner;

public class Employee {
    Scanner sc=new Scanner(System.in);
    //Employee name
    String name;
    //Employee id
    int id;
    //Employee attendance: true/false
    boolean attendance;
    //number of daily work day
    int normalWorkday=0;
    //Salary per Hour
    int salperhour=20;
    //Daily Salary
    double dailySalary=0;
    //number of working days per month
    int monthworkday=20;
//    double MonthlySalary=0;
    //total working hours
    int maxHours=100;

    int workingHours=0;
    int wageTillCon=0;
    int totalWage=0;
    int totalHours=0;

    //method for taking input : name,id,sal per hr,working days/month,total working days
    Employee(String name,int id,int sal,int mon,int mHours){
        this.name=name;
        this.id=id;
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

//    public void calMonthlyWage(){
//        MonthlySalary+=dailySalary;
//    }

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
//            e1.calMonthlyWage();
            calWageTillCond();
            totalHours=(tillHours+workingHours);
            System.out.println(" total working hours till now :"+totalHours);
        }
        System.out.println("Total wage :"+totalWage +" and total working hours :"+ totalHours);

    }





//    Employee(String n,int a,int salperhour,int monthworkday,int maxHours){
//        this.name=n;
//        this.id=a;
//        this.salperhour=salperhour;
//        this.monthworkday=monthworkday;
//        this.maxHours=maxHours;
//    }

}
