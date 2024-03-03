package POO3.Library;

public class LibraryItem {
    private int number;
    private String title;

    public LibraryItem(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Number: " + number);
        System.out.println("Title: " + title);
    }
}
