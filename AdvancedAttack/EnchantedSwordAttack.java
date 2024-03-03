package POO3.AdvancedAttack;

public class EnchantedSwordAttack implements IAdvancedAttack{
    private String name;
    private int manaCost;
    private int StrenghtCost;
    private int magicDamageDealt;
    private int physicalDamageDealt;

    public EnchantedSwordAttack(String name, int manaCost, int StrenghtCost, int magicDamageDealt, int physicalDamageDealt) {
        this.name = name;
        this.manaCost = manaCost;
        this.StrenghtCost = StrenghtCost;
        this.magicDamageDealt = magicDamageDealt;
        this.physicalDamageDealt = physicalDamageDealt;
    }

    @Override
    public void cast() {
        System.out.println("Lanzando ataque Espadazo Encantado");
    }

    @Override
    public int manaCost() {
        return manaCost;
    }

    @Override
    public int StrenghtCost() {
        return StrenghtCost;
    }

    @Override
    public int magicDamageDealt() {
        return magicDamageDealt;
    }

    @Override
    public int physicalDamageDealt() {
        return physicalDamageDealt;
    }
}
