package lk.ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    private String authorId;
    private String name;
    @ManyToMany(mappedBy = "author")
    private List<Book> book;

    public Author(String authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}
