package com.yegor;

/**
 * This class contains method for sorting of array of int with insertion sort.
 * Created by YegorKost on 23.01.2017.
 */
public class InsertionSort {

    /**
     * This method sorts array of int which sorted with insertion sort.
     * @param intArray the array to be sorted
     * @param descending if true then array to be sorted in descending order,
     *                   if false then array to be sorted in ascending order
     */
    public void insertionSort(int[] intArray, boolean descending) {

        for (int i = 1; i < intArray.length; i++){ // i - index of inserted element

            int insertedElement = intArray[i];

            for (int n = i-1; n >= -1; n--){ // n - index of element in the sorted array

                if (n == -1){ // if true then element inserts with index 0
                    intArray[0] = insertedElement;
                } else if (defineDirectionOfSort(insertedElement, intArray[n], descending)){
                    intArray[n+1] = intArray[n];
                } else {
                    intArray[n+1] = insertedElement;
                    break;
                }
            }

        }
    }

    private boolean defineDirectionOfSort(int insertedElement, int elementOfSortedArray, boolean descending) {
        if (descending) {
            return insertedElement > elementOfSortedArray;
        } else {
            return insertedElement < elementOfSortedArray;
        }
    }

}
