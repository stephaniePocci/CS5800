public class Ship {
    private String shipName;
    private int yearBuilt;

    public Ship(String newShipName, int newYearBuilt) {
        shipName = newShipName;
        yearBuilt = newYearBuilt;
    }

    public void printShipInfo() { // Constructor
        System.out.println("Ship name: " + shipName + "\n" + "Year built: " + yearBuilt);
    }

    public void setShipName(String newShipName) { // shipName mutator
        this.shipName = newShipName;
    }

    public void setYearBuilt(int newYearBuilt) { // yearBuilt mutator
        this.yearBuilt = newYearBuilt;
    }

    public String getShipName() { // shipName accessor
        return shipName;
    }

    public int getYearBuilt() { // yearBuilt accessor
        return yearBuilt;
    }
}

