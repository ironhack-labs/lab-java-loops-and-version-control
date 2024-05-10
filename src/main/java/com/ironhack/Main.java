package com.ironhack;

import com.google.gson.Gson;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO one Company and ten Dancers
        Company AIBGLOBAL = new Company(
                "AIBGLOBAL", "Aib Avenue 209 Asokoro Abuja", 2001);
        Faker faker = new Faker();
        CompanyDeclaration cd = new CompanyDeclaration();
        cd.setOwner("Osa Clement");
        cd.setCompany(AIBGLOBAL);
        var list = new ArrayList<Dancer>();
        for (int i = 0; i < 10; i++) {
            Dancer dancer = new Dancer(faker.music().genre(),faker.country().name(),AIBGLOBAL);
            list.add(dancer);
        }
        cd.setDancers(list);

        // TODO convert this to Json and print
var gson = new Gson();
String json = gson.toJson(cd);
System.out.println(json);
    }
}