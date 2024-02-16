public class Employee {
    private String[] fullName;
    private int socialSecurity;

    public Employee(int size, int social) { //Constructor
        fullName = new String[size];
        socialSecurity = social;
    }

    public int getSocialSecurity() { //socialSecurity accessor
        return socialSecurity;
    }

    public void setSocialSecurity(int newSocial) { //socialSecurity mutator
        this.socialSecurity = newSocial;
    }

    public String getFirstName() { //first name accessor
        return fullName[0];
    }

    public String getLastName() { //last name accessor
        return fullName[1];
    }

    public void setFullName(String firstName, String lastName) { //fullName mutator
        this.fullName[0] = firstName;
        this.fullName[1] = lastName;
    }
}

class SalariedEmployee extends Employee {
    private int salary;
    public SalariedEmployee(int size, int social, int newSalary) { // Constructor
        super(size, social);
        salary = newSalary;
    }

    public int getSalary() { //salary accessor
        return salary;
    }

    public void setSalary(int newSalary) { //salary mutator
        this.salary = newSalary;
    }
}

class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(int size, int social, int newWage, int newHours) { //Constructor
        super(size, social);
        wage = newWage;
        hoursWorked = newHours;
    }

    public int getWage() { // wage accessor
        return wage;
    }

    public int getHoursWorked() { // hoursWorked accessor
        return hoursWorked;
    }

    public void setWage(int newWage) { // wage mutator
        this.wage = newWage;
    }

    public void set(int newHoursWorked) { // hoursWorked mutator
        this.hoursWorked = newHoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(int size, int social, int newCommissionRate, int newGrossSales) { // Constructor
        super(size, social);
        commissionRate = newCommissionRate;
        grossSales = newGrossSales;
    }

    public int getCommissionRate() { // commissionRate accessor
        return commissionRate;
    }

    public int getGrossSales() { // grossSales accessor
        return grossSales;
    }

    public void setCommissionRate(int newCommissionRate) { // commissionRate mutator
        this.commissionRate = newCommissionRate;
    }

    public void setGrossSales(int newGrossSales) { // grossSales mutator
        this.grossSales = newGrossSales;
    }
}

class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee(int size, int social, int newBaseSalary) { // constructor
        super(size, social);
        baseSalary = newBaseSalary;
    }

    public int getBaseSalary() { // baseSalary accessor
        return baseSalary;
    }

    public void setBaseSalary(int newBaseSalary) { // baseSalary mutator
        this.baseSalary = newBaseSalary;
    }
}
