package com.yegor;

/**
 * This class contains method for sorting of array of int with selection sort.
 * Created by YegorKost on 24.01.2017.
 */
public class SelectionSort {

    /**
     * This method sorts array of int which sorted with selection sort.
     * @param intArray the array to be sorted
     * @param descending if true then array to be sorted in descending order,
     *                   if false then array to be sorted in ascending order
     */
    public void selectionSort(int[] intArray, boolean descending) {

        for (int i = 0; i < intArray.length; i++){ // i - index of inserted element

            /* remember position of smallest (ascending sort) or biggest (descending sort) element
            * in unsorted part or array
            */
            int selectedPosition = i;

            for (int select = i; select < intArray.length; select++) {
                if (defineDirectionOfSort(intArray[selectedPosition], intArray[select], descending)){
                    selectedPosition = select;
                }
            }

            if (selectedPosition != i){
                int temporary = intArray[i];
                intArray[i] = intArray[selectedPosition];
                intArray[selectedPosition] = temporary;
            }


        }
    }

    private boolean defineDirectionOfSort (int selectedPosition, int select, boolean descending) {
        if (descending){
            return selectedPosition < select;
        } else {
            return selectedPosition > select;
        }
    }

}
