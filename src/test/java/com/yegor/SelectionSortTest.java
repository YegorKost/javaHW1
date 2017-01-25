package com.yegor;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 24.01.2017.
 */
public class SelectionSortTest {

    private int[] arr = {2,34,5,56,77,3,5,8,9,0,3,2,45,7,89,445,-4,-1,-5};
    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void selectionSortAscendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        System.out.print("Ascending selection sort - ");
        System.out.println(Arrays.toString(selectionSort.selectionSort(arr, false)) + "\n");
    }

    @Test
    public void selectionSortDescendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        System.out.print("Descending selection sort - ");
        System.out.println(Arrays.toString(selectionSort.selectionSort(arr, true)) + "\n");
    }

}