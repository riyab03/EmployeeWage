import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name");
        String name=sc.next();
        System.out.println("Enter employee id");
        int id=sc.nextInt();
        Employee e1= new Employee(name,id);
        for(int i=0;i<e1.monthworkday;i++) {
            Random r = new Random();
            int a = (r.nextInt(1000)) % 3;
            switch (a) {
                case 1 ->{
                    e1.attendence(true);
                    e1.normalWorkday = 8;
                }
                case 2 -> {
                    e1.attendence(true);
                    System.out.print(" Part time today: ");
                    e1.normalWorkday = 4;
                }
                default -> {
                    e1.attendence(false);
                }
            }
            e1.calDailyWage(i);
            e1.calMonthlyWage();
        }
        System.out.println("Monthly Salary is: "+e1.MonthlySalary);
    }
}