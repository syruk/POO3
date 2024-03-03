package POO3.Vehicle;

public class Tourism extends Vehicle{
    private int numSeats;
    enum typeOfUse {
        INDIVIDUAL, PROFESSIONAL
    }
    private typeOfUse typeOfVehicle;

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public typeOfUse getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(typeOfUse typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public Tourism(String licencePlate, int numWheels, int numSeats, typeOfUse typeOfVehicle) {
        super(licencePlate, numWheels);
        this.numSeats = numSeats;
        this.typeOfVehicle = typeOfVehicle;
    }
    public String toString() {
        return "Turismo: " + "\n"+
                "Matrícula: '" + getLicencePlate() + "\n"+
                "Nø Ruedas: '" + getNumWheels() + "\n"+
                "Nø Plazas: " + numSeats + "\n"+
                "Uso: " + typeOfVehicle + "\n";
    }
}
