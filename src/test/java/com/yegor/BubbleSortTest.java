package com.yegor;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by YegorKost on 23.01.2017.
 */
public class BubbleSortTest {

    private int[] arr = {2,34,5,56,77,3,5,8,9,0,3,2,45,7,89,445,-4,-1,-5};
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void bubbleSortAscendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        System.out.print("Ascending bubble sort - ");
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr, false)) + "\n");
    }

    @Test
    public void bubbleSortDescendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        System.out.print("Descending bubble sort - ");
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr, true)) + "\n");
    }

}