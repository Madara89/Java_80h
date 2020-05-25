package lv.madara.Classes;

public class Employee { //task13

    // class attributes (variables):
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // create class constructor:
    public Employee (int id, String firstName, String lastName, int salary){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    }

    // create Getters and Setters for asked attributes (getters have return/setters have this.)
    // getters use data type, setters use void
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return getFirstName()+" "+ getLastName();
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }

    // create method for salary raise:
    public int raiseSalary(int percent){
        return salary + (salary * percent / 100);
    }

    // create toString for out print in console:

    @Override
    public String toString() {
        return "Employee [" +
                "id = " + id +
                ", name = " + getName() +
                ", salary = " + salary +
                ']';
    }

    // this class can be only tested outside of the package "Classes"
    // main method has to outside the package
}
