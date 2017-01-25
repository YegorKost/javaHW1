package com.yegor;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Created by YegorKost on 24.01.2017.
 */
public class SelectionSortTest {

    private int[] arr = {2, 34, 5, 56, 7, 3, 5, 8, 45, -4, -1, -5};
    private int[] arrAscending = {-5, -4, -1, 2, 3, 5, 5, 7, 8, 34, 45, 56};
    private int[] arrDescending = {56, 45, 34, 8, 7, 5, 5, 3, 2, -1, -4, -5};
    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void selectionSortAscendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        selectionSort.selectionSort(arr, false);
        assertArrayEquals(arrAscending, arr);
        System.out.print("Ascending selection sort - ");
        System.out.println(Arrays.toString(arr) + "\n");
    }

    @Test
    public void selectionSortDescendingTest() throws Exception {
        System.out.println("Array - " + Arrays.toString(arr));
        selectionSort.selectionSort(arr, true);
        assertArrayEquals(arrDescending, arr);
        System.out.print("Descending selection sort - ");
        System.out.println(Arrays.toString(arr) + "\n");
    }

}