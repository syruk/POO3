package POO3.Vehicle;
public class MainVehicle {
    public static void main(String[] args) {
        Tourism seatIbiza = new Tourism("GW12345",4,4, Tourism.typeOfUse.INDIVIDUAL){        };
        System.out.println(seatIbiza);
        Truck scania = new Truck("JH4561", 16, 5000, true){};
        System.out.println(scania);
        Motorcycle hondaValkirie = new Motorcycle("KL654",2, 1000){};
        System.out.println(hondaValkirie);
    }
}
