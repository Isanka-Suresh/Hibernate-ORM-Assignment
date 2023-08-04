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
        Book book2= new Book("B002","IT for Dummies");
        Book book3= new Book("B003","IT for Dummies");

        List<Book>books1=new ArrayList<>();
        books1.add(book1);
        books1.add(book2);

        List<Book>books2=new ArrayList<>();
        books2.add(book3);

        Author author1=new Author("A001","Dummy");
        Author author2=new Author("A002","Dolly");

        List<Author>authors1=new ArrayList<>();
        authors1.add(author1);
        authors1.add(author2);

        List<Author>authors2=new ArrayList<>();
        authors2.add(author1);

        book1.setAuthor(authors1);
        book2.setAuthor(authors1);
        book3.setAuthor(authors2);

        author1.setBook(books1);
        author2.setBook(books2);

        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        session.persist(book1);
        session.persist(book2);
        session.persist(book3);

        session.persist(author1);
        session.persist(author2);

        transaction.commit();
        session.close();
    }
}
