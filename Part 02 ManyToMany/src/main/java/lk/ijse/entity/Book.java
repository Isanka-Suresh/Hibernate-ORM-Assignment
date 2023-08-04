package lk.ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    private String id;
    private String title;
    @ManyToMany
    private List<Author> author;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }
}
