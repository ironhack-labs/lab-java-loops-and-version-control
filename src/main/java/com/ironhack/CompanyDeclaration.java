package com.ironhack;

import java.util.List;

public class CompanyDeclaration {
    private String owner;
    private Company company;
    private List <Dancer> dancers;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Dancer> getDancers() {
        return dancers;
    }

    public void setDancers(List<Dancer> dancers) {
        this.dancers = dancers;
    }
}
