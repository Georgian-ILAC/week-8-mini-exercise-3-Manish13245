public class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee (String firstName, String lastName, int id, double hourlyPay) {
        super(firstName, lastName); 
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise() {
        this.hourlyPay *= 1.15;
        return this.hourlyPay;
    }

    public double payDay(int hoursWorked) {
        double totalPay;
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
        } else {
            totalPay = hoursWorked * hourlyPay;
        }
        return totalPay;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "They are " + (int)(getHeight() / 12) + "’" + (int)(getHeight() % 12) + "”\n" +
                "They make $" + hourlyPay + "\n" +
                "They have the employee ID " + id + "\n";
    }
}
