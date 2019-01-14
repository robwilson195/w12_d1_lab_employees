package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String niNum, double salary, String deptName, double budget) {
        super(name, niNum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return super.payBonus() * 2;
    }
}
