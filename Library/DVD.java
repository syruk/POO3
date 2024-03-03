package POO3.Library;

public class DVD extends LibraryItem {
    private String director;
    private int year;
    private String type;

    public DVD(int number, String title, String director, int year, String type) {
        super(number, title);
        this.director = director;
        this.year = year;
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void play() {
        System.out.println("Playing the DVD: " + getTitle());
    }

    public void displayDVDDetails() {
        displayDetails();
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
    }
}
