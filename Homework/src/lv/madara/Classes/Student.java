package lv.madara.Classes;

public class Student extends Person { //task 15 - word extend gives Person a super class status

    // create subclass attributes (variables):
    private String program;
    private int year;
    private double fee;

    // create subclass constructor:
    public Student (String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // create getters and setters:
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }

    // create toString:
    @Override
    public String toString() {
        return "Student [" +super.toString()+
                ", program = " + getProgram() +
                ", year = " + getYear() +
                ", fee = " + getFee() +
                "]";
    }
}
