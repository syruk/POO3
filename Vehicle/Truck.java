package POO3.Vehicle;

public class Truck extends Vehicle{
    private int maxAuthorizedWeight;

    public void setHazardousCargo(boolean hazardousCargo) {
        this.hazardousCargo = hazardousCargo;
    }

    private boolean hazardousCargo;

    public int getMaxAuthorizedWeight() {
        return maxAuthorizedWeight;
    }

    public void setMaxAuthorizedWeight(int maxAuthorizedWeight) {
        this.maxAuthorizedWeight = maxAuthorizedWeight;
    }

    public Truck(String licencePlate, int numWheels, int maxAuthorizedWeight, boolean hazardousCargo) {
        super(licencePlate, numWheels);
        this.maxAuthorizedWeight = maxAuthorizedWeight;
        this.hazardousCargo = hazardousCargo;
    }
    public boolean isHazardousCargo() {
        return hazardousCargo;
    }

    public String toString() {
        return "Camión: " + "\n"+
                "Matrícula: '" + getLicencePlate() + "\n"+
                "Nø Ruedas: '" + getNumWheels() + "\n"+
                "Peso máximo autorizado: " + maxAuthorizedWeight + "\n"+
                "Carga peligrosa: " + isHazardousCargo() + "\n";
    }
}
