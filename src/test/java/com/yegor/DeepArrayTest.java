package com.yegor;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 23.01.2017.
 */
public class DeepArrayTest {

    private DeepArray deepArray = new DeepArray();

    @Test
    public void getDeepArray() throws Exception {
        System.out.println("-----");
        int[][] dArr = deepArray.getDeepArray(5, 8, 101);
        System.out.println(Arrays.deepToString(dArr));
        System.out.println("The sum of all numbers in deep array: " + deepArray.getSumOfValuesInDeepArray(dArr) + "\n"
        + "-----");
    }

}