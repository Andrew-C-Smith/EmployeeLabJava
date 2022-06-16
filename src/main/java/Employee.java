public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    };

    public String getNiNumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(){
        salary= (double) (salary *1.01);

        return salary;
    }

    public double payBonus(){
        double bonus = salary *0.01;
       return bonus;
    }
}
