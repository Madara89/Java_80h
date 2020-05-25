package lv.madara.Classes;

public class Person { //task15 - inheritance principle (parent class and subclasses):

    // create parent class attributes:
    private String name;
    private String address;

    // create parent class constructor:
    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    // create getters and setter:
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // create toString (automatic):
    @Override
    public String toString() {
        return "Person [" +
                "name = " + this.name +
                ", address = " + this.address+" ]";
    }
}
