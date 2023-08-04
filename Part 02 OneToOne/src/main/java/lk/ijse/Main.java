package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author("A001","Dummy");
        Book book1= new Book("B001","IT for Dummies",author1);

        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        session.persist(author1);
        session.persist(book1);

        transaction.commit();
        session.close();
    }
}
