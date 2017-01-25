package com.yegor;

/**
 * This class contains method which returns a massage
 * depending on the time of call.
 * Created by YegorKost on 23.01.2017.
 */
public class Call {

    /**
     * This method returns a massage
     * depending on the time of call.
     * @param hour hour
     * @param minute minute
     * @param hourOfBeginResting begin of resting (hour)
     * @param hourOfEndResting end of resting (hour)
     */
    public void callToSubscribe(int hour, int minute, int hourOfBeginResting, int hourOfEndResting) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60) {
            System.out.println("Enter correct time!");
        } else if (hour >= hourOfEndResting && hour < hourOfBeginResting) {
            System.out.println("Hello!");
        } else {
            System.out.println("Current time - " + hour + ":" + minute + ". Subscriber is resting. " +
                    "Call from 8 to 21");
        }
    }

}
