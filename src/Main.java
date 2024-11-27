import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee("ram",123);
        Random r=new Random();
        int i=(r.nextInt(1000))%2;
        switch (i){
            case 1->e1.attendence(true);
            default->e1.attendence(false);
        }
        e1.calculateWage();
    }
}