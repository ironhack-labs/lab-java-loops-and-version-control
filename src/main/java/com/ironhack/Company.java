package com.ironhack;

public class Company {

    private String name;
    private String address;
    private int foundationYear;

    public Company(String name, String address, int foundationYear) {
        this.name = name;
        this.address = address;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
