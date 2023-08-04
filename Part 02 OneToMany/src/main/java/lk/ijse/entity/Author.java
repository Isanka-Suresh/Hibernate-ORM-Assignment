package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private String authorId;
    private String name;
    @OneToMany(mappedBy = "author")
    private List<Book> book;

    public Author(String authorId, String name, List<Book> book) {
        this.authorId = authorId;
        this.name = name;
        this.book = book;
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
