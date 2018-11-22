package io.github.fernandoferreiratbe.employees.domain;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private Address address;
    private double salary;

    public Employee(int id, String name, String surname, Address address, double salary) {
        this.id      = id;
        this.name    = name;
        this.surname = surname;
        this.address = address;
        this.salary  = salary;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return this.salary * 0.20;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;

        return address != null ? address.equals(employee.address) : employee.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);

        return result;
    }
}
