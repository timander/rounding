package net.timandersen;


public class Rounder {

    public Integer roundToNearestHundred(Integer number) {


        if (number < 150) {
            return 100;
        } else if (number > 150 && number < 250) {
            return 200;
        }
        
        return 500;
    }

}
