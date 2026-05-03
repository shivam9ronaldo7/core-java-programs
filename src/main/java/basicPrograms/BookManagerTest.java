package basicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookManagerTest {
}

class BookManager {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    public Optional<Book> findBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }

    public List<Book> findBooksByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    public List<Book> findBookByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    public List<Book> findBooksByPublication(String publication) {
        return books.stream().filter(book -> book.getPublication().equals(publication)).collect(Collectors.toList());
    }

}

class Book {
    int id;
    String title;
    String author;
    String publication;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

}