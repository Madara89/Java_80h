package lv.madara;

import lv.madara.Classes.Customer;
import lv.madara.Classes.Invoice;

public class TestCustomerInvoice {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1234,"Zanda Liepa",10);
        System.out.println(customer1.toString());
        System.out.println("Customer discount is "+customer1.getDiscount()+"%");
        System.out.println("-------------------------");
        customer1.setDiscount(25);
        System.out.println("Customer new discount is "+customer1.getDiscount()+"%");
        System.out.println("-------------------------");

        // with customer1, variable invoice1 gets all the customer data:
        Invoice invoice1 = new Invoice(18,customer1, 109.90);
        System.out.println(invoice1.getCustomerName());
        System.out.println("Invoice amount is "+invoice1.getAmount()+" EUR.");
        System.out.println("Amount after 25% discount is "+ invoice1.getAmountAfterDiscount());
        System.out.println("--------------------------");
        invoice1.setAmount(250.50);
        System.out.println("Updated invoice amount is now "+invoice1.getAmount()+" EUR.");
        System.out.println("Amount after 25% discount is "+invoice1.getAmountAfterDiscount()+" EUR.");


    }
}
