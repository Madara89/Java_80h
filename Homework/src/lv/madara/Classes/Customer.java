package lv.madara.Classes;

public class Customer { //task14 - compose principle

    // create class attributes (variables):
    private int id;
    private String name;
    private int discount;

    // create constructor:
    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // create Getters and setter:
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getDiscount(){
        return discount;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }

    // create toString:
    public String toString(){
        return getName()+" (ID"+getId()+")";
    }

}
