package POO3.Vehicle;

public class Motorcycle extends Vehicle {
    private int engineDisplacement;
    private int maxDisplacementWithoutLicence = 125;

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public Motorcycle(String licencePlate, int numWheels, int engineDisplacement) {
        super(licencePlate, numWheels);
        this.engineDisplacement = engineDisplacement;
    }

    public boolean isLicenceNeeded() {
        return engineDisplacement > maxDisplacementWithoutLicence;
    }

    public String toString() {
        return "Motocicleta: " + "\n"+
                "Matrícula: '" + getLicencePlate() + "\n"+
                "Nø Ruedas: '" + getNumWheels() + "\n"+
                "Cilindrada: " + engineDisplacement + "\n"+
                "Necesita licencia: " + isLicenceNeeded() + "\n";
    }
}
