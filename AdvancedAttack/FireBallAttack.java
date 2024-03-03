package POO3.AdvancedAttack;

public class FireBallAttack implements IAdvancedAttack{
    private String name;
    private int manaCost;
    private int magicDamageDealt;

    public FireBallAttack(String name, int manaCost, int magicDamageDealt) {
        this.name = name;
        this.manaCost = manaCost;
        this.magicDamageDealt = magicDamageDealt;
    }

    @Override
    public void cast() {
        System.out.println("Lanzando ataque Bola de Fuego");
    }

    @Override
    public int manaCost() {
        return manaCost;
    }

    @Override
    public int StrenghtCost() {
        return 0; // No hay costo de esfuerzo físico para este ataque
    }

    @Override
    public int magicDamageDealt() {
        return magicDamageDealt;
    }

    @Override
    public int physicalDamageDealt() {
        return 0; // No inflige daño físico
    }
}
