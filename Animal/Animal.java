package POO3.Animal;
abstract class Animal {
    public String name;
    public String habitat;
    public int numLegs;
    enum nutritionType {
        HERVIVORE, CARNIVORE, INSECTIVORE, OMNIVORE
    }
    public nutritionType food;
    enum family {
        MAMAL, REPTILE, FISH, BIRD, INSECT, ARACHNID
    }
    public family type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public nutritionType getFood() {
        return food;
    }

    public Animal(String name, String habitat, int numLegs, nutritionType food, family type) {
        this.name = name;
        this.habitat = habitat;
        this.numLegs = numLegs;
        this.food = food;
        this.type = type;
    }

    public void setFood(nutritionType food) {
        this.food = food;
    }

    public family getType() {
        return type;
    }

    public void setType(family type) {
        this.type = type;
    }

    public abstract String toString();
    abstract void eat();
    abstract void sleep();
    abstract void makeNoise();
}
