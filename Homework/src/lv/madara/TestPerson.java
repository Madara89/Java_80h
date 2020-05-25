package lv.madara;

import lv.madara.Classes.Person;
import lv.madara.Classes.Staff;
import lv.madara.Classes.Student;

public class TestPerson { //task15 - testing class Person and subclasses
    public static void main(String[] args) {

        Person person1 = new Person("Dace Smilga","Palmu iela 75");
        System.out.println(person1.getAddress());
        System.out.println(person1.getName());
        System.out.println(person1.toString());
        System.out.println("-----------------------------");
        person1.setAddress("Dzelzavas iela 120"); //this setAddress allows to change designated variable
        System.out.println("Persons new address is "+person1.getAddress());
        System.out.println(person1.toString());
        System.out.println("-----------------------------");

        Student student1 = new Student("Ieva Mieze","Graudu iela 68","Marketing",2019,3500.00);
        System.out.println(student1.toString());
        student1.setFee(3200.00);
        student1.setProgram("Business management");
        student1.setYear(2020);
        System.out.println(student1.toString());
        System.out.println("------------------------------");
        Staff staff1 = new Staff("Liene Ape","Lejas iela 5","RCHV",900.0);
        System.out.println(staff1.toString());
        System.out.println("Staff previous pay was "+staff1.getPay()+" EUR.");
        staff1.setPay(1200.00);
        System.out.println("Staff new pay is "+staff1.getPay()+" EUR.");
        staff1.setSchool("Augstskola Turiba");
        System.out.println(staff1.toString());

    }
}
