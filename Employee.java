abstract public class Employee {
    String name;
    double baseSalary;
    int ID;
    private static int countEmployee;
    double bonus;
    double budget;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        countEmployee++;
        ID = countEmployee;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.ID;
    }

    abstract public Employee getManager();

    public boolean equals(Employee other) {
        return this.ID == other.ID;
    }

    public String toString() {
        return (this.getEmployeeID() + " " + this.getName());
    }

    abstract public String employeeStatus();
}