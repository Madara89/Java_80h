package lv.madara.School;

public class Student extends Person { //inheritance with extends method:

    private int numCourse;
    private int classNum;

    //izveido konstruktoru:
    public Student(String name, String address){ //ieliek mainīgos, kurus ņems no Person klases
        super(name, address); //super konstruktorā dos info no Person klases
        this.numCourse = 10; //definē atribūtiem vērtības savā Student klasē
        this.classNum = 12;
    }

    //izveido Getters:
    public int getNumCourse() {
        return numCourse;
    }
    public int getClassNum() {
        return classNum;
    }

    //toString metode:
    //izmaina tekstu kā vajag
    @Override
    public String toString() {
        return "Student: "+super.getName()+ " ("+super.getAddress()+"), number of courses "+getNumCourse()+", class number "+getClassNum()+".";
        //izmanto super nevis this, jo ņem datus no super
    }
}
