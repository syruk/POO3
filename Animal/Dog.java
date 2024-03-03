package POO3.Animal;

public class Dog extends Animal {
    public String race;
    enum job {
        HUNTER, SHEPARD, SECURITY, COMPANY
    }
    public boolean isDangerous;

    public Dog(String name, String habitat, int numLegs, nutritionType food, family type, String race, boolean isDangerous) {
        super(name, habitat, numLegs, food, type);
        this.race = race;
        this.isDangerous = isDangerous;
    }

    public void eat(){
        System.out.println("The Dog of race " + race + " eats " + "chicken, becouse he is " + food);
    }
    public void sleep(){
        System.out.println("The Dog sleeps... zzzZZZ");
    }
    public void makeNoise(){
        System.out.println("The Dog make noise and barks! Woof Woof!!");
    }
    public String toString(){
        return "Animal: " + name + "\n"+
                "Habitat: " + getHabitat() + "\n"+
                "Nø Legs: '" + getNumLegs() + "\n"+
                "Eats: " + getFood() + "\n"+
                "Family: " + getType() + "\n"+
                "Race: " + race + "\n"+
                "Is dangerous: " + isDangerous + "\n";
    }
    public void fetch() {
        System.out.println("The dog fetches the ball!");
    }

}
