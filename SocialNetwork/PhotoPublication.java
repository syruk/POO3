package POO3.SocialNetwork;

public class PhotoPublication implements ReactionPublication, OpenPublication {
    private String fileName;

    public PhotoPublication(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void publish() {
        System.out.println("Publishing photo: " + fileName);
    }

    @Override
    public void share() {
        System.out.println("Sharing photo: " + fileName);
    }

    @Override
    public void open() {
        System.out.println("Opening photo: " + fileName);
    }

    @Override
    public void comment(String comment) {
        System.out.println("Commenting on photo: " + comment);
    }
}
