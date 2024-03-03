package POO3.SocialNetwork;

public class VideoPublication implements ReactionPublication, OpenPublication {
    private String fileName;

    public VideoPublication(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void publish() {
        System.out.println("Publishing video: " + fileName);
    }

    @Override
    public void share() {
        System.out.println("Sharing video: " + fileName);
    }

    @Override
    public void open() {
        System.out.println("Opening video: " + fileName);
    }

    @Override
    public void comment(String comment) {
        System.out.println("Commenting on video: " + comment);
    }
}
