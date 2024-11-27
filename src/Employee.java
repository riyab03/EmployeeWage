public class Employee {
    String name;
    int id;
    boolean attendance=false;
    public void attendence(boolean a) {
        if(a){
            attendance=true;
            System.out.println("employee is present" );
        }
        else{
            System.out.println("employee is absent" );
        }
    }
    Employee(String n,int a){
        this.name=n;
        this.id=a;
    }

}
