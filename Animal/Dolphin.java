package POO3.Animal;
public class Dolphin extends Animal {
    public boolean isFriendly;
    public Dolphin(String name, String habitat, int numLegs, nutritionType food, family type, boolean isFriendly) {
        super(name, habitat, numLegs, food, type);
        this.isFriendly = isFriendly;
    }

    public void swim() {
        System.out.println("The dolphin swims gracefully in the ocean!");
    }


    public void eat() {
        System.out.println("The dolphin eats fish because it's " + food);
    }


    public void sleep() {
        System.out.println("The dolphin takes a nap underwater...");
    }


    public void makeNoise() {
        System.out.println("The dolphin squeaks and clicks!");
    }

    public void interact() {
        if (isFriendly) {
            System.out.println("The dolphin interacts playfully with humans!");
        } else {
            System.out.println("The dolphin seems cautious around humans.");
        }
    }

    public String toString(){
        return "Animal: " + name + "\n"+
                "Habitat: " + getHabitat() + "\n"+
                "Nø Legs: '" + getNumLegs() + "\n"+
                "Eats: " + getFood() + "\n"+
                "Family: " + getType() + "\n"+
                "Is Friendly: " + isFriendly + "\n";
    }
}