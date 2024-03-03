package POO3.Animal;
public class Cow extends Animal{

    public String typeOfCow;
    public boolean itIsMilkable;

    public Cow(String name, String habitat, int numLegs, nutritionType food, family type, String typeOfCow, boolean itIsMilkable) {
        super(name, habitat, numLegs, food, type);
        this.typeOfCow = typeOfCow;
        this.itIsMilkable = itIsMilkable;
    }

    public void eat(){
        System.out.println("The Cow eats grass, becouse she is " + food);
    }
    public void sleep(){
        System.out.println("The Cow sleeps... zzzZZZ");
    }
    public void makeNoise(){
        System.out.println("The Cow make noise and moos! Mooooooo!!");
    }
    public String toString(){
        return "Animal: " + name + "\n"+
                "Habitat: " + getHabitat() + "\n"+
                "Nø Legs: '" + getNumLegs() + "\n"+
                "Eats: " + getFood() + "\n"+
                "Family: " + getType() + "\n"+
                "Race: " + typeOfCow + "\n"+
                "It is Milkable: " + itIsMilkable + "\n";
    }
    public void milk() {
        if (itIsMilkable) {
            System.out.println("Milking the cow...");
        } else {
            System.out.println("This cow cannot be milked!");
        }
    }

}

