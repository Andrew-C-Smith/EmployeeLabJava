public class Director extends Manager{

    private double budget;

    public Director(String name, String deptName, String niNumber, double salary, double budget) {
        super(name, deptName, niNumber, salary);
        this.budget = budget;
    }
    public double getBudget(){
        return budget;
    }

}
