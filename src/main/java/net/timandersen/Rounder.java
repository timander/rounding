package net.timandersen;


public class Rounder {

    public Integer roundToNearestHundred(Integer number) {
        int rounded = number / 100;
        if (number % 100 >= 50) {
            return rounded * 100 + 100;
        } else {
            return rounded * 100;
        }
    }

}
