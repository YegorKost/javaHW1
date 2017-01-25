package com.yegor;

import java.util.Random;

/**
 * This class contains methods for creating two-dimensional array
 * of int and for getting the sum of all elements.
 * Created by YegorKost on 23.01.2017.
 */
public class DeepArray {

    /**
     * This method returns two-dimensional array which has number
     * from 0 (inclusive) to {@code maxValueExclusive} (exclusive).
     * @param size1 size of first dimension
     * @param size2 size of second dimension
     * @param maxValueExclusive max value of random number (exclusive)
     * @return two-dimensional array of int
     */
    public int[][] getDeepArray(int size1, int size2, int maxValueExclusive) {

        Random random = new Random();
        int[][] result = null;

        if (size1 > 0 && size2 > 0 && maxValueExclusive > 0){
            result = new int[size1][size2];
            for (int s1 = 0; s1 < size1; s1++){
                for (int s2 = 0; s2 < size2; s2++){
                    result[s1][s2] = random.nextInt(maxValueExclusive);
                }
            }
        } else {
            System.out.println("Values of size1, size2 and maxValueExclusive" +
                    " must be positive and bigger than zero!");
        }
        return result;
    }

    /**
     * This method returns the sum of all numbers in two-dimensional array.
     * @param deepArray the two-dimensional array
     * @return the sum of all numbers in two-dimensional array
     */
    public int getSumOfValuesInDeepArray(int[][] deepArray) {
        int result = 0;

        if (deepArray != null){
            for (int[] ints: deepArray) {
                for (int i: ints){
                    result += i;
                }
            }
        } else {
            System.out.println("Array is not initialize!");
        }
        return result;
    }

}
