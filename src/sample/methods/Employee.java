package sample.methods;

import java.util.Objects;

class Employee implements Comparable<Employee>,Cloneable {
    private int id;
    private String name;

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
