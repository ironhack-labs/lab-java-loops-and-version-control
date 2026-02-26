package org.example.Car_Inventory_System;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle( boolean fourWheelDrive, String vinNumber,String make, String model, int mileage) {

        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean getFourWheelDrive(){
        return fourWheelDrive;
    }
    public void setFourwheelDrive(double fourWhileDrive){
        this.fourWheelDrive =fourWheelDrive;
    }

    @Override
    public String getInfo(){
        if ( fourWheelDrive = true ) {
            return "Four-wheel cehicle\n" + "UtilityVehicle\n" + super.getInfo();
        }else{
            return "Non four-wheel cehicle\n" + "UtilityVehicle\n" + super.getInfo();
        }
    }

}

