package lv.madara;

import lv.madara.School.Student;
import lv.madara.School.Teacher;

public class PersonTest {
    public static void main(String[] args) {

        Student student1 = new Student ("Toms", "Liepu 77"); //ieraksta mainīgos
        System.out.println(student1.toString()); //teksts, ko printēs 

        Teacher teacher1 = new Teacher("Gatis","Graudu 68");
        System.out.println(teacher1.toString());
    }
}

