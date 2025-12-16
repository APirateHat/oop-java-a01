package se.company.resource;

public class Employee {
    protected String name;
    protected String work;
    private int salary;

    public Employee(String name, String work, int salary){
        this.name = name;
        this.work = work;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Emp: " + name;
    }

    public String work(){
        return "working in " + work;
    }
}
