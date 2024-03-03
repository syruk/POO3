package POO3.Animal;

public class Snake extends Animal {
    public String nameOfTheSnake;
    public boolean itIsPoisonous;

    public Snake(String name, String habitat, int numLegs, nutritionType food, family type, String nameOfTheSnake, boolean itIsPoisonous) {
        super(name, habitat, numLegs, food, type);
        this.nameOfTheSnake = nameOfTheSnake;
        this.itIsPoisonous = itIsPoisonous;
    }

    public String getNameOfTheSnake() {
        return nameOfTheSnake;
    }

    public void setNameOfTheSnake(String nameOfTheSnake) {
        this.nameOfTheSnake = nameOfTheSnake;
    }

    public boolean isItIsPoisonous() {
        return itIsPoisonous;
    }

    public void setItIsPoisonous(boolean itIsPoisonous) {
        this.itIsPoisonous = itIsPoisonous;
    }
    public String toString(){
        return "Animal: " + name + "\n"+
                "Habitat: " + getHabitat() + "\n"+
                "Nø Legs: '" + getNumLegs() + "\n"+
                "Eats: " + getFood() + "\n"+
                "Family: " + getType() + "\n"+
                "Race: " + nameOfTheSnake + "\n"+
                "How the snake hunt: " + howTheSnakeHunt() + "\n";
    }
    public void eat(){
        System.out.println("The Snake of race " + nameOfTheSnake + " eats a mice, because he is " + food);
    }
    public void sleep(){
        System.out.println("The Snake sleeps... zzzZZZ");
    }
    public void makeNoise(){
        System.out.println("Ssss Ssss!");
    }
    public String howTheSnakeHunt(){
        if (itIsPoisonous) {
            System.out.println("Using venom, beware!");
        } else System.out.println("It's a constrictor snake, break bones and suffocate.");
        return null;
    }
}
