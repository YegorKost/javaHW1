package com.yegor;

import org.junit.Test;
import java.util.Arrays;
import static  org.junit.Assert.*;

/**
 * Created by YegorKost on 23.01.2017.
 */
public class BubbleSortTest {

    private int[] arr = {2, 34, 5, 56, 7, 3, 5, 8, 45, -4, -1, -5};
    private int[] arrAscending = {-5, -4, -1, 2, 3, 5, 5, 7, 8, 34, 45, 56};
    private int[] arrDescending = {56, 45, 34, 8, 7, 5, 5, 3, 2, -1, -4, -5};
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void bubbleSortAscendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        bubbleSort.bubbleSort(arr, false);
        assertArrayEquals(arrAscending, arr);
        System.out.print("Ascending bubble sort - ");
        System.out.println(Arrays.toString(arr) + "\n");
    }

    @Test
    public void bubbleSortDescendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        bubbleSort.bubbleSort(arr, true);
        assertArrayEquals(arrDescending, arr);
        System.out.print("Descending bubble sort - ");
        System.out.println(Arrays.toString(arr) + "\n");
    }

}