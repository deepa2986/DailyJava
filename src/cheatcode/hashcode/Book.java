package cheatcode.hashcode;

import java.util.Objects;

public class Book {

    private String author;
    private String title;
    private int publicationYear;

    public Book(String a, String t, int pY){
        this.author = a;
        this.title = t;
        this.publicationYear = pY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return publicationYear == book.publicationYear && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
