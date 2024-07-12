public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Deepak", "Pradhan", 123456, 17.0);
        employee.setHeight(75); 
        
        System.out.print(employee);
        System.out.println("***");

        System.out.println("New hourly pay after raise: $" + employee.getRaise());
        System.out.println("***");

        int hoursWorked = 45;
        System.out.println("Total pay for " + hoursWorked + " hours: $" + employee.payDay(hoursWorked));
        System.out.println("***");

        System.out.println("Updated status:");
        System.out.print(employee);
        System.out.println("***");
    }
}
