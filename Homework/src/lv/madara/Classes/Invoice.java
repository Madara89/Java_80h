package lv.madara.Classes;

public class Invoice { //task14 - compose principle

    // create class attributes (variables):
    private int id;
    private Customer customer;
    private double amount;

    // create constructor:
    public Invoice (int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // create getters and setters:
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        return amount - (amount * customer.getDiscount()/100);
    }

}
