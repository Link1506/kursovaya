public class Employee {

    private static int idGenerator = 1;
    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = idGenerator++;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id=" + id + ", fullName='" + fullName + '\'' + ", department=" + department + ", salary=" + salary;
    }
}
