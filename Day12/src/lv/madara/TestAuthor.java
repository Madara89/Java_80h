package lv.madara;

import lv.madara.Bookstore.Author;
import lv.madara.Bookstore.Book;

public class TestAuthor {
    //izveido main metodi, kur testē Author class:

    public static void main(String[] args) {

        Author author1 = new Author("Roulinga", "roulinga@gmail.com", 'f');
        System.out.println(author1.toString()); //testē uz toString metodi

        Book book1 = new Book("Harijs Poters",author1, 25.99, 1000);
        //author1 ņem visus datus par grāmatas autoru
        System.out.println(book1.toString());

    }
}
