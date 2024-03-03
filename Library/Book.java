package POO3.Library;

public class Book extends LibraryItem {
    private String author;
    private String publisher;

    public Book(int number, String title, String author, String publisher) {
        super(number, title);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void displayBookDetails() {
        displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}
