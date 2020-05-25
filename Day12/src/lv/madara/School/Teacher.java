package lv.madara.School;

public class Teacher extends Person{ //klase ņems datus no Person kalses (extends)

    private int numCourse;
    private String title;

    public Teacher(String name, String address){
        super(name, address);
        this.numCourse = 3;
        this.title = "Mr.Professor";
    }

    //Getteri:
    public int getNumCourse() {
        return numCourse;
    }
    public String getTitle() {
        return title;
    }

    //toString metode:
    @Override
    public String toString() {
        return "Teacher: "+super.getName()+" ("+super.getAddress()+"), number of courses "+getNumCourse()+", title = "+getTitle();
    }
}
