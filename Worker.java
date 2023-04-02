package OOP.OOP_HW.HW05;

public class Worker {
    private int id;
    private String name;
    private String position;
    private int salary;

    public Worker(int id, String name, String position, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
public String toString() {
    return "ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
}
}
