package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
  super();


        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        newSpeed = newSpeed + rate;

        if(newSpeed == 0) {
            setCurrentSpeed(0);
            setCurrentGear(1);
            vehicleisMoving = false;


            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0 && newSpeed <51) {

            setCurrentGear(1);
            changeSpeed(newSpeed, getCurrentDirection());

        }
        else if(newSpeed >50 && newSpeed <101){
            setCurrentGear(2);
            changeSpeed(newSpeed, getCurrentDirection());
        }
        else if(newSpeed >100 && newSpeed <151){
            setCurrentGear(3);
            changeSpeed(newSpeed, getCurrentDirection());
        }
        else if(newSpeed >150 && newSpeed <201){
            setCurrentGear(4);
            changeSpeed(newSpeed, getCurrentDirection());
        }
        else if(newSpeed >200 && newSpeed <251){
            setCurrentGear(5);
            changeSpeed(newSpeed, getCurrentDirection());
        }
        else if(newSpeed >250){
            setCurrentGear(6);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
