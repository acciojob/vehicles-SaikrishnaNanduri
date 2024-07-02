package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 6, isManual, "Formula 1", 1);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        int newGear;
        if (newSpeed == 0) {
            newGear = 1; // Car is stopped
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6; // Speed more than 250
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
