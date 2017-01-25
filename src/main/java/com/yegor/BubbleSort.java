package com.yegor;

/**
 * This class contains method for sorting of array of int with bubble sort.
 * Created by YegorKost on 23.01.2017.
 */
public class BubbleSort {

    /**
     * This method sorts array of int which sorted with bubble sort.
     * @param intArray the array to be sorted
     * @param descending if true then array to be sorted in descending order,
     *                   if false then array to be sorted in ascending order
     */
    public void bubbleSort(int[] intArray, boolean descending) {

        int loop = intArray.length; // loop - number of unsorted elements
        while (loop > 0){
            for (int i = 0; i < loop-1; i++){
                if (defineDirectionOfSort(intArray[i], intArray[i+1], descending)) {
                    int current = intArray[i];
                    intArray[i] = intArray[i+1]; //this code replace elements in array
                    intArray[i+1] = current;

//                    intArray[i] = intArray[i] + intArray[i+1];
//                    intArray[i+1] = intArray[i] - intArray[i+1]; //this code replace elements in array
//                    intArray[i] = intArray[i] - intArray[i+1];

//                    intArray[i] = intArray[i] ^ intArray[i+1];
//                    intArray[i+1] = intArray[i] ^ intArray[i+1]; //this code replace elements in array
//                    intArray[i] = intArray[i] ^ intArray[i+1];


                }
            }
            loop--;
        }
    }

    private boolean defineDirectionOfSort(int sortedElement, int element, boolean descending) {
        if (descending) {
            return sortedElement < element;
        } else {
            return sortedElement > element;
        }
    }


}
