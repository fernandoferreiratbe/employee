package io.github.fernandoferreiratbe.employees.domain;

public class Manager extends Employee {

    public Manager(int id, String name, String surname, Address address, double salary) {
        super(id, name, surname, address, salary);
    }

    @Override
    public double getBonus() {
        return (this.getSalary() * 0.42) + 2000;
    }
}
