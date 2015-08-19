package hoang.pham.vn.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hoangpvm on 8/14/2015.
 */
public class Book {
    private String isbn;
    private String name;
    private Date publishDate;
    private BigDecimal price;
    private Publisher publisher;

    public Book() {
    }

    public Book(String isbn, String name, Date publishDate, BigDecimal price, Publisher publisher) {
        this.isbn = isbn;
        this.name = name;
        this.publishDate = publishDate;
        this.price = price;
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (publishDate != null ? !publishDate.equals(book.publishDate) : book.publishDate != null) return false;
        if (price != null ? !price.equals(book.price) : book.price != null) return false;
        return !(publisher != null ? !publisher.equals(book.publisher) : book.publisher != null);

    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }
}
