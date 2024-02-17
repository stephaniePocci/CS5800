public class Instructor {
    private final String[] fullName;
    private int officeNumber;

    public Instructor(String newFirstName, String newLastName, int newOfficeNumber) { // Constructor
        fullName = new String[2];
        this.fullName[0] = newFirstName;
        this.fullName[1] = newLastName;
        this.officeNumber = newOfficeNumber;
    }

    public String getFirstName() { // first name accessor
        return fullName[0];
    }

    public String getLastName() { // last name accessor
        return fullName[1];
    }

    public int getOfficeNumber() { // office number accessor
        return officeNumber;
    }

    public void setOfficeNumber(int newOfficeNumber) { // office number mutator
        this.officeNumber = newOfficeNumber;
    }

    public void setFirstName(String newFirstName) { // first name mutator
        this.fullName[0] = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.fullName[1] = newLastName;
    }
}

