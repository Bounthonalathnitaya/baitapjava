package _interface.IEmployee;

public class TestIEmployee {

    public static void main(String[] args){
    IEmployee a = new Employee("nty",20);
    System.out.println("Name = "+ a.getName()+", Salary = "+a.calculateSalary());
    IEmployee b = new PartTimeEmployee("pmh",28,8);
    System.out.println("Name = "+ b.getName()+", Salary = "+b.calculateSalary());
    IEmployee c = new FullTimeEmployee("Pm",20);
    System.out.println("Name = "+ c.getName()+", Salary = "+c.calculateSalary());
}
}
