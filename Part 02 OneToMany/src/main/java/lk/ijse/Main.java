package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1= new Book("B001","IT for Dummies");
        Book book2= new Book("B001","IT for Dummies");

        List<Book>books=new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Author author1=new Author("A001","Dummy",books);

        book1.setAuthor(author1);
        book2.setAuthor(author1);

        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        session.persist(author1);
        session.persist(book1);

        transaction.commit();
        session.close();
    }
}
