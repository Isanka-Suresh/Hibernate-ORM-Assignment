package lk.ijse;

import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book1= new Book("B001","IT for Dummies","Dummy");

        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        //Create
        session.persist(book1);

        //Read
        Book book2=session.get(Book.class,"B001");
        System.out.println(book2.getTitle()+"\n"+book2.getAuthor());

        //Update
        book1.setAuthor("Donkey Kong");
        session.update(book1);

        book2=session.get(Book.class,"B001");
        System.out.println(book2.getTitle()+"\n"+book2.getAuthor());

        //Delete
        session.delete(book1);

        transaction.commit();
        session.close();
    }
}
