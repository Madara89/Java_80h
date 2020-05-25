package lv.madara;

import lv.madara.Classes.Employee;

public class TestEmployee {
    // create main class for testing

    public static void main(String[] args) {

        Employee employee1 = new Employee(291289,"Madara","Lapsiņa",2000);
        Employee employee2 = new Employee(160805,"Markuss","Silva",2300);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        System.out.println(employee1.getName()+ " annual salary is "+employee1.getAnnualSalary()+" EUR.");
        System.out.println(employee2.getName()+ " annual salary is "+employee2.getAnnualSalary()+" EUR.");

        System.out.println(employee1.getName()+" got a 15% salary raise. Her new salary is "+ employee1.raiseSalary(15));
        System.out.println(employee2.getName()+" got a 25% salary raise. His new salary is "+ employee2.raiseSalary(25));
    }
}
