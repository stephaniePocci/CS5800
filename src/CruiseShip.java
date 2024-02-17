public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String shipName, int yearBuilt, int maxPassengers) { // Constructor
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public void setMaxPassengers(int newMaxPassengers) { // maxPassengers mutator
        this.maxPassengers = newMaxPassengers;
    }

    public int getMaxPassengers() { // maxPassengers accessor
        return maxPassengers;
    }

    public void printShipInfo() {
        System.out.println("Ship name: " + getShipName() + "\n" + "Max number of passengers: " + maxPassengers);
    }

}
