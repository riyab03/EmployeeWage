import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of companies: ");
        int n = sc.nextInt();
        EmpWageBuilder e=new EmpWageBuilder(n);
        for (int i = 0; i < n; i++) {
            e.ComputeWage();
        }
    }
}