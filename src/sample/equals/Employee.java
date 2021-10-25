package sample.equals;

import java.util.Objects;

//従業員
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//1と2
        if (o == null || getClass() != o.getClass()) return false;//1と3　1と21
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);//1と4
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
