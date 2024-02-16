public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee(2, 111111111, 2500);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(2, 222222222, 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee(2, 333333333, 19, 47);
        CommissionEmployee commissionEmployee1 = new CommissionEmployee(2, 444444444, 15, 50000);
        BaseEmployee baseEmployee1 = new BaseEmployee(2, 555555555, 1700);
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

        baseEmployee1.setFullName("Renwa", "Chanel");
        baseEmployee1.setSocialSecurity(555555555);

        baseEmployee2.setFullName("Mike", "Davenport");
        baseEmployee2.setSocialSecurity(666666666);

        commissionEmployee2.setFullName("Mahnaz", "Vaziri");
        commissionEmployee2.setSocialSecurity(777777777);

        // Print info for each employee
        printEmployeeInfo(salariedEmployee1);
        printEmployeeInfo(hourlyEmployee1);
        printEmployeeInfo(hourlyEmployee2);
        printEmployeeInfo(commissionEmployee1);
        printEmployeeInfo(baseEmployee1);
        printEmployeeInfo(baseEmployee2);
        printEmployeeInfo(commissionEmployee2);
    }
    public static void printEmployeeInfo(Employee employee) {
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Social Security Number: " + employee.getSocialSecurity());
        switch (employee) {
            case SalariedEmployee salariedEmployee ->
                    System.out.println("Weekly Salary: " + salariedEmployee.getSalary());
            case HourlyEmployee hourlyEmployee -> {
                System.out.println("Wage: " + hourlyEmployee.getWage());
                System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
            }
            case CommissionEmployee commissionEmployee -> {
                System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate());
                System.out.println("Gross Sales: " + commissionEmployee.getGrossSales());
            }
            case BaseEmployee baseEmployee -> System.out.println("Base Salary: " + baseEmployee.getBaseSalary());
            default -> {
            }
        }
        System.out.println();
    }
}
