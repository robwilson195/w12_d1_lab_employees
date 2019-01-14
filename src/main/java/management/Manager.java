package management;

import staff.Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, String niNumber, double salary, String deptName){
        super(name, niNumber, salary);
        this.departmentName = deptName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
