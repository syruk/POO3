package POO3.AdvancedAttack;

public class SwordAttack implements IAdvancedAttack{
    private String name;
    private int StrenghtCost;
    private int physicalDamageDealt;

    public SwordAttack(String name, int StrenghtCost, int danioFisico) {
        this.name = name;
        this.StrenghtCost = StrenghtCost;
        this.physicalDamageDealt = physicalDamageDealt;
    }

    @Override
    public void cast() {
        System.out.println("Lanzando ataque Espadazo");
    }

    @Override
    public int manaCost() {
        return 0; // No utiliza maná
    }

    @Override
    public int StrenghtCost() {
        return StrenghtCost;
    }

    @Override
    public int magicDamageDealt() {
        return 0; // No inflige daño mágico
    }

    @Override
    public int physicalDamageDealt() {
        return physicalDamageDealt;
    }
}
