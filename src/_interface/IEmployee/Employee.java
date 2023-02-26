package _interface.IEmployee;

public class Employee implements IEmployee{
    String name;
    int paymentPerHour;
    public Employee(String name, int paymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int calculateSalary() {
        return 8*30;
    }
}
