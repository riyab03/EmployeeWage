import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Ability to manage Employee Wage of multiple companies using Interface approach
interface EmpWage {
    void addCompany(String name, int sal, int mon, int mHours);
    void ComputeWage();
}


//EmpWageBuilder has array of many
//CompanyEmpWage Object
class EmpWageBuilder implements EmpWage {
    int n, index = 1;
   ArrayList<Employee> companies= new ArrayList<>();

    public void addCompany(String name, int sal, int mon, int mHours) {
        Employee e=new Employee(name, sal, mon, mHours);
        companies.add(e);
    }

    public void ComputeWage() {
        Scanner sc = new Scanner(System.in);
        int i=1;
        do {
            System.out.println("Enter Company name");
            String name = sc.next();
            System.out.println("Enter salary per hour");
            int salperhour = sc.nextInt();
            System.out.println("Enter number of working days per month");
            int monthworkday = sc.nextInt();
            System.out.println("Enter total working hours");
            int maxHours = sc.nextInt();
            addCompany(name, salperhour, monthworkday, maxHours);
            for (Employee company : companies) {
                company.computeWage();
                System.out.println(company);
            }
            System.out.println("For continue, enter 1. To exit, enter 0:");
            i=sc.nextInt();
        }while(i!=0);
    }
}


class Employee {
    String name;  //Employee name
    boolean attendance=false;//number of daily work day
    int salperhour = 20;//Salary per Hour
    double dailySalary = 0; //Daily Salary
    int monthworkday = 20; //number of working days per month
    int maxHours = 100;//total working hours

    int workingHours = 0;
    int totalWage = 0;


    //method for taking input : name,id,sal per hr,working days/month,total working days
    Employee(String name, int sal, int mon, int mHours) {
        this.name = name;
        this.salperhour = sal;
        this.monthworkday = mon;
        this.maxHours = mHours;
    }


    //method for recording attendance everyday
    public void attendence(boolean a) {
        if (a) {
            attendance = true;
            System.out.print(" employee is present ");
        } else {
            attendance = false;
            System.out.print(" employee is absent ");
        }
    }

    //calculating daily wage
    public void calDailyWage(int i) {
        if (attendance) {
            dailySalary = workingHours * salperhour;
            System.out.println(" Salary for day " + (i + 1) + " is: " + dailySalary);
        } else {
            dailySalary = 0;
            System.out.println(" Salary for day " + (i + 1) + " is: " + dailySalary);
        }
    }


    public void computeWage() {
        int totalHours = 0;
        for (int  day = 0; day < monthworkday && totalHours <= maxHours; day++) {
            Random r = new Random();
            int a = r.nextInt(3)+1;
            switch (a) {
                case 1 -> {
                    attendence(true);
                    System.out.print(" Full time today: ");
                    workingHours = 8;
                }
                case 2 -> {
                    attendence(true);
                    System.out.print(" Part time today: ");
                    workingHours = 4;
                }
                default -> {
                    attendence(false);
                    workingHours = 0;
                }
            }
            calDailyWage(day);
            totalHours += workingHours;
            totalWage+=dailySalary;
        }System.out.println("Total Wage "+totalWage);
    }

    @Override
    public String toString() {
        return "Name of Company: " + name + "\n" + "salary per hour : " + salperhour + "\n" + "Working days in a Month : " + monthworkday + "\n" + "Maximum working Hours: " + maxHours + "\n" + "Total Wage : " + totalWage + "\n";
    }
}
