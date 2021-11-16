package pro.sky.java.course1.coursework;

public class Employee {
    private static Integer GLOBAL_ID = 0;
    private Integer id;
    private String fio;
    private Integer department;
    private Float salary;

    public Employee(String fio, Integer department, Float salary) {
        this.id = generateId();
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    private static Integer generateId(){
        return GLOBAL_ID++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
