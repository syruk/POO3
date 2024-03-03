package POO3.Library;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private int year;

    public Magazine(int number, String title, int issueNumber, int year) {
        super(number, title);
        this.issueNumber = issueNumber;
        this.year = year;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayMagazineDetails() {
        displayDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Year: " + year);
    }
}
