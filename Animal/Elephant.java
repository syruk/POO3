package POO3.Animal;

public class Elephant extends Animal {
    public boolean hasTusks;

    public Elephant(String name, String habitat, int numLegs, nutritionType food, family type, boolean hasTusks) {
        super(name, habitat, numLegs, food, type);
        this.hasTusks = hasTusks;
    }

    public void sprayWater() {
        System.out.println("The elephant sprays water using its trunk!");
    }

    public void eat() {
        System.out.println("The elephant munches on leaves and grass because it's " + food);
    }

    public void sleep() {
        System.out.println("The elephant takes a rest under the shade...");
    }

    public void makeNoise() {
        System.out.println("The elephant trumpets loudly!");
    }

    public void charge() {
        if (hasTusks) {
            System.out.println("The elephant lowers its tusks and charges forward!");
        } else {
            System.out.println("The elephant moves forward with determination!");
        }
    }
    public String toString(){
        return "Animal: " + name + "\n"+
                "Habitat: " + getHabitat() + "\n"+
                "Nø Legs: '" + getNumLegs() + "\n"+
                "Eats: " + getFood() + "\n"+
                "Family: " + getType() + "\n"+
                "Has tusks: " + hasTusks + "\n";
    }
}