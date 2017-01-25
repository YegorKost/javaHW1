package com.yegor;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by YegorKost on 23.01.2017.
 */
public class InsertionSortTest {
    private int[] arr = {2,34,5,56,77,3,5,8,9,0,3,2,45,7,89,445,-4,-1,-5};

    private InsertionSort insertionSort = new InsertionSort();
    @Test
    public void insertionSortAscendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        System.out.print("Ascending insertion sort - ");
        System.out.println(Arrays.toString(insertionSort.insertionSort(arr, false)) + "\n");
    }

    @Test
    public void insertionSortDescendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        System.out.print("Descending insertion sort - ");
        System.out.println(Arrays.toString(insertionSort.insertionSort(arr, true)) + "\n");
    }

}