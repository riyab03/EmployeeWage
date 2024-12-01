import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void ComputeWage(){
        Scanner sc=new Scanner(System.in);
        int i=1;
        do {
            Employee e1 = new Employee();
            e1.input();
            e1.compute();
            System.out.println("for exit : enter 0");
            i=sc.nextInt();
        }while(i!=0);
    }

    public static void main(String[] args) {
        ComputeWage();
    }
}