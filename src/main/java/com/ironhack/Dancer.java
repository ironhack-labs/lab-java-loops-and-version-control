package com.ironhack;

public class Dancer {

    private String style;
    private String origin;
    private Company company;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Dancer(String style, String origin, Company company) {
        this.style = style;
        this.origin = origin;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "style='" + style + '\'' +
                ", origin='" + origin + '\'' +
                ", company=" + company +
                '}';
    }
}
