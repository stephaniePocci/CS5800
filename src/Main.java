import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Part3();
    }

    public static void Part1() {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee(2, 111111111, 2500);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(2, 222222222, 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee(2, 333333333, 19, 47);
        CommissionEmployee commissionEmployee1 = new CommissionEmployee(2, 444444444, 15, 50000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee(2, 555555555, 1700);
        BaseEmployee baseEmployee2 = new BaseEmployee(2, 666666666, 95000);
        CommissionEmployee commissionEmployee2 = new CommissionEmployee(2, 777777777, 22, 40000);

        salariedEmployee1.setFullName("Joe", "Jones");
        salariedEmployee1.setSocialSecurity(111111111);

        hourlyEmployee1.setFullName("Stephanie", "Smith");
        hourlyEmployee1.setSocialSecurity(222222222);

        hourlyEmployee2.setFullName("Mary", "Quinn");
        hourlyEmployee2.setSocialSecurity(333333333);

        commissionEmployee1.setFullName("Nicole", "Dior");
        commissionEmployee1.setSocialSecurity(444444444);

        salariedEmployee2.setFullName("Renwa", "Chanel");
        salariedEmployee2.setSocialSecurity(555555555);

        baseEmployee2.setFullName("Mike", "Davenport");
        baseEmployee2.setSocialSecurity(666666666);

        commissionEmployee2.setFullName("Mahnaz", "Vaziri");
        commissionEmployee2.setSocialSecurity(777777777);

        // Print info for each employee
        printEmployeeInfo(salariedEmployee1);
        printEmployeeInfo(hourlyEmployee1);
        printEmployeeInfo(hourlyEmployee2);
        printEmployeeInfo(commissionEmployee1);
        printEmployeeInfo(salariedEmployee2);
        printEmployeeInfo(baseEmployee2);
        printEmployeeInfo(commissionEmployee2);
    }
    public static void printEmployeeInfo(Employee employee) {
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Social Security Number: " + employee.getSocialSecurity());
        switch (employee) {
            case SalariedEmployee salariedEmployee ->
                    System.out.println("Weekly Salary: $" + salariedEmployee.getSalary());
            case HourlyEmployee hourlyEmployee -> {
                System.out.println("Wage: $" + hourlyEmployee.getWage());
                System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
            }
            case CommissionEmployee commissionEmployee -> {
                System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate() + "%");
                System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
            }
            case BaseEmployee baseEmployee -> System.out.println("Base Salary: $" + baseEmployee.getBaseSalary());
            default -> {
            }
        }
        System.out.println();
    }
    public static void Part2() {
        Ship[] ships = new Ship[3]; //static array
        Scanner scanner = new Scanner(System.in);
        String shipName = "";

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Ship 1\n" + "Enter ship name and press enter: " );
                shipName = scanner.nextLine();
                System.out.println("Ship name entered: " + shipName);
                System.out.println("Enter year ship was built and press enter: " );
                String yearBuiltString = scanner.nextLine();
                int yearBuiltInt = Integer.parseInt(yearBuiltString);
                System.out.println("Year entered: " + yearBuiltString);
                ships[i] = new Ship(shipName, yearBuiltInt);
                System.out.println("\n");
            } else if (i == 1) {
                System.out.println("Ship 2\n" + "Enter ship name and press enter: " );
                shipName = scanner.nextLine();
                System.out.println("Ship name entered: " + shipName);
                System.out.println("Enter year ship was built and press enter: " );
                String yearBuiltString = scanner.nextLine();
                int yearBuiltInt = Integer.parseInt(yearBuiltString);
                System.out.println("Year entered: " + yearBuiltString);
                System.out.println("Enter maximum amount of passengers: ");
                String maxPassengersString = scanner.nextLine();
                int maxPassengersInt = Integer.parseInt(maxPassengersString);
                System.out.println("Max amount of passengers entered: " + maxPassengersString);
                ships[i] = new CruiseShip(shipName, yearBuiltInt, maxPassengersInt);
                System.out.println("\n");
            } else {
                System.out.println("Ship 3\n" + "Enter ship name and press enter: " );
                shipName = scanner.nextLine();
                System.out.println("Ship name entered: " + shipName);
                System.out.println("Enter year ship was built and press enter: " );
                String yearBuiltString = scanner.nextLine();
                int yearBuiltInt = Integer.parseInt(yearBuiltString);
                System.out.println("Year entered: " + yearBuiltString);
                System.out.println("Enter maximum amount of cargo capacity (tonnes): ");
                String maxCargoCapacityString = scanner.nextLine();
                int maxCargoCapacityInt = Integer.parseInt(maxCargoCapacityString);
                System.out.println("Max amount of cargo capacity entered: " + maxCargoCapacityString);
                ships[i] = new CargoShip(shipName, yearBuiltInt, maxCargoCapacityInt);
            }
        }

        for (Ship ship : ships) { //printShipInfo(); for each ship
            ship.printShipInfo();
            System.out.println("\n");
        }
        scanner.close();
    }
    public static void Part3() {
        Instructor instructor = new Instructor("Nima", "Divarpanah", 3-2636);
        Instructor instructor2 = new Instructor("Stephanie", "Pocci", 502);
        Textbook textbook = new Textbook("Clean Code", "John Smith", "Ubisoft");
        Textbook textbook2 = new Textbook("How To Crochet", "Jane Doe", "Nintendo");
        Course course = new Course("CS 5800", instructor, instructor2, textbook2, textbook);
        course.printCourseInfo();
    }
}