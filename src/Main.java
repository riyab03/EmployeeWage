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

        for(int tillHours=0,day=0;day<e1.monthworkday && tillHours<=e1.maxHours;day++,tillHours+=e1.workingHours) {

            Random r = new Random();
            int a = (r.nextInt(1000)) % 3;

            switch (a) {
                case 1 ->{
                    e1.attendence(true);
                    System.out.print(" Full time today: ");
                    e1.normalWorkday = 8;
                    e1.workingHours=8;
                }
                case 2 -> {
                    e1.attendence(true);
                    System.out.print(" Part time today: ");
                    e1.normalWorkday = 4;
                    e1.workingHours=4;
                }
                default -> {
                    e1.attendence(false);
                    e1.workingHours=0;
                }
            }

            e1.calDailyWage(day);
//            e1.calMonthlyWage();
            e1.calWageTillCond();

            e1.totalHours=(tillHours+e1.workingHours);
            System.out.println(" total working hours till now :"+e1.totalHours);

        }
        System.out.println("Total wage :"+e1.totalWage +" and total working hours :"+ e1.totalHours);
    }
}