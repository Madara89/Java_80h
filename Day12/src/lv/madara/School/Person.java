package lv.madara.School;

public class Person {

    //2 atribūti:
    private String name;
    private String address;

    //izveido konstruktoru:
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //izveido Getters:
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    //izveido Setter adresei:
    public void setAddress(String address) {
        this.address = address;
    }

    //toString metode:
    @Override
    public String toString() {
        return this.name+" ("+this.address+")";
    }
}
