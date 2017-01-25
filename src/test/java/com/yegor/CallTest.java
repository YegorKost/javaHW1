package com.yegor;

import org.junit.Test;

/**
 * Created by YegorKost on 23.01.2017.
 */
public class CallTest {

    private Call call = new Call();

    @Test
    public void callToSubscribe() throws Exception {
        System.out.println("-----");
        call.callToSubscribe(6, 56, 21, 8);
        call.callToSubscribe(7, 59, 21, 8);
        call.callToSubscribe(8, 0, 21, 8);
        call.callToSubscribe(10, 0, 21, 8);
        call.callToSubscribe(12, 45, 21, 8);
        call.callToSubscribe(20, 59, 21, 8);
        call.callToSubscribe(21, 0, 21, 8);
        call.callToSubscribe(0, 0, 21, 8);
        call.callToSubscribe(24, 1, 21, 8);
        call.callToSubscribe(22, 60, 21, 8);
        call.callToSubscribe(-22, 10, 21, 8);
        call.callToSubscribe(22, -10, 21, 8);
        System.out.println("-----");

    }

}