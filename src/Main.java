import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void ComputeWage(){
        Scanner sc=new Scanner(System.in);
        int i=1;
        do {
            System.out.println("Enter employee name");
            String name=sc.next();
            System.out.println("Enter employee id");
            int id=sc.nextInt();
            System.out.println("Enter salary per hour");
            int salperhour=sc.nextInt();
            System.out.println("Enter number of working days per month");
            int monthworkday=sc.nextInt();
            System.out.println("Enter total working hours");
            int maxHours=sc.nextInt();
            Employee e1 = new Employee(name,id,salperhour,monthworkday,maxHours);


            e1.compute();
            System.out.println("for exit : enter 0");
            i=sc.nextInt();
        }while(i!=0);
    }

    public static void main(String[] args) {
        ComputeWage();
    }
}