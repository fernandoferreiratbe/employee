package io.github.fernandoferreiratbe.employees.domain;

public class Address {
    private String street;
    private int number;
    private String district;
    private String state;

    public Address(String street, int number, String district, String state) {
        this.street   = street;
        this.number   = number;
        this.district = district;
        this.state    = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.street + ", No: " + this.number + " " + this.district + " - " + this.state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (number != address.number) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (district != null ? !district.equals(address.district) : address.district != null) return false;

        return state != null ? state.equals(address.state) : address.state == null;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + number;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);

        return result;
    }
}
