package com.learn.spring;

public class DriveImpl2 implements Drive{
    private String carName;

    public DriveImpl2(){

    }
    public DriveImpl2(String carName){
        this.carName = carName;
    }
    public void driveCar() {
        System.out.println("i am driving Fast:: "+carName);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
