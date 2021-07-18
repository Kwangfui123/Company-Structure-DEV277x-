abstract public class BusinessEmployee extends Employee {

    public double budget;

    public BusinessEmployee(String name) {
        super(name,50000.0);

    }

    public double getBonusBudget() {
        return budget;
    }

    public String employeeStatus() {
        return (this.ID + " " + this.name + " with a budget of " + String.format("%.2f",budget));
    }

    abstract public Employee getManager();

}