public class Manager extends Employee{


    private String deptName;

    public Manager(String name, String deptName, String niNumber, double salary ) {
        super(name, niNumber, salary);

        this.deptName = deptName;

    }


    public String getDeptName(){
        return deptName;
    }


}



