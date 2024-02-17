public class CargoShip extends Ship { // polymorphism
    private int cargoCapacity;

    public CargoShip(String shipName, int yearBuilt, int newCargoCapacity) { // Constructor
        super(shipName, yearBuilt);
        this.cargoCapacity = newCargoCapacity;
    }

    public void setCargoCapacity(int newCargoCapacity) { // cargoCapacity mutator
        this.cargoCapacity = newCargoCapacity;
    }

    public int getCargoCapacity() { // cargoCapacity accessor
        return cargoCapacity;
    }

    public void printShipInfo() {
        System.out.println("Ship name: " + getShipName() + "\n" + "Cargo capacity: " + cargoCapacity);
    }
}
