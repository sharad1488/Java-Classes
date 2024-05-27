package com.learn.spring;

public class DriveImpl implements Drive{

    private String carName;

    public DriveImpl(){

    }
    public DriveImpl(String carName){
        this.carName = carName;
    }
    public void driveCar() {
        System.out.println("i am driving :: "+carName);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
