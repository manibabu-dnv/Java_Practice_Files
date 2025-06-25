class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
public class Oops_Creation {
    public static void main(String[] args) {
        Employee mb=new Employee();
        mb.setName("Manibabu");
        mb.salary=100000;
        System.out.println(mb.getSalary());
        System.out.println(mb.getName());
    }
}
