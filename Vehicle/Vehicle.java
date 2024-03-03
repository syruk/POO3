package POO3.Vehicle;

abstract class Vehicle {

    private final String licencePlate;
    private final int numWheels;

    public Vehicle(String licencePlate, int numWheels) {
        this.licencePlate = licencePlate;
        this.numWheels = numWheels;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public int getNumWheels() {
        return numWheels;
    }
    public abstract String toString();
}
