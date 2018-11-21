package io.github.fernandoferreiratbe.employees.domain;

public class Developer extends Employee {

    public Developer(int id, String name, String surname, Address address, double salary) {
        super(id, name, surname, address, salary);
    }

    @Override
    public double getBonus() {
        return super.getBonus() + 1200;
    }
}
