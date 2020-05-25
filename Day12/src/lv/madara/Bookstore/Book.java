package lv.madara.Bookstore;

public class Book { //using composition method (bez extends):

    private String name;
    private Author author; //klase Author ir kā datu tips
    private double price;
    private int qty;

    //izveido konstruktoru (with generate):
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    //izveido Getterus:
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    //izveido Setterus 2 atribūtiem:
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    //toString izveido, izdzēš tekstu un ieliek, ko pašam vajag ar return:
    @Override
    public String toString() {
        return this.name+" by "+author.getName()+" ("+author.getGender()+") at "+author.getEmail();
    }
    //šo klasi testē pie TestAuthor klases, kur bija info par autoru
}
