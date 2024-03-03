package POO3.Attacks;

public class MartialAttack implements Attack {
    private String name;
    private int cost;
    private int damage;

    public MartialAttack(String name, int cost, int damage) {
        this.name = name;
        this.cost = cost;
        this.damage = damage;
    }

    @Override
    public void cast() {
        System.out.println("Lanzando ataque físico: " + name);
    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public int damageDealt() {
        return damage;
    }
}

