package POO3.SocialNetwork;

public class TextPublication implements ReactionPublication {
    private String text;

    public TextPublication(String text) {
        this.text = text;
    }

    @Override
    public void publish() {
        System.out.println("Publishing text: " + text);
    }

    @Override
    public void share() {
        System.out.println("Sharing text: " + text);
    }

    @Override
    public void comment(String comment) {
        System.out.println("Commenting on text: " + comment);
    }
}
