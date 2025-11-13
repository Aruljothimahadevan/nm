package nm.lab.thirdEx;

public class Employee {
    private int id;
    private String name;
    private Address address;
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        address.displayAddress();
    }
}