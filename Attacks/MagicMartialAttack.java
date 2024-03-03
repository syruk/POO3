package POO3.Attacks;

public class MagicMartialAttack implements Attack{
    private String name;
    private int cost;
    private int damage;

    public MagicMartialAttack(String name, int cost, int damage) {
        this.name = name;
        this.cost = cost;
        this.damage= damage;
    }

    @Override
    public void cast() {
        System.out.println("Lanzando ataque mágico y físico: " + name);
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
