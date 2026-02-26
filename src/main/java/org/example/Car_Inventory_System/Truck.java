package org.example.Car_Inventory_System;

public class Truck extends Car {
    private  double towingCapasity;
    private double toeingCapaity;
    public Truck(double towingCapasity, String vinNumber, String make, String model, int mileage){
        super(vinNumber, make, model, mileage);
        this.towingCapasity = towingCapasity;
    }
    public double getTowingCapasity(){
        return towingCapasity;
    }
    public void setTowingCapasity(double towingCapasity){
        this.towingCapasity = towingCapasity;
    }

    @Override
    public String getInfo(){
        return "Towing Capasity: "+ towingCapasity+ "\n" + "Truck\n"+ super.getInfo();
    }

}
