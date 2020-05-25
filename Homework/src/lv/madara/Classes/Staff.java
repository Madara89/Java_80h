package lv.madara.Classes;

public class Staff extends Person { //task15 - inheritance principle (extends Person class)

    //create subclass attributes:
    private String school;
    private double pay;

    //create subclass constructor:
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    //create getters and setters:
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    //create toString:

    @Override
    public String toString() {
        return "Staff [" + super.toString()+
                ", school = " + getSchool() +
                ", pay = " + getPay() +
                "]";
    }
}
