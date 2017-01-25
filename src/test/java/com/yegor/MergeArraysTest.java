package com.yegor;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 24.01.2017.
 */
public class MergeArraysTest {

    private int[] arr0 = {-1, 3, 5, 6, 6, 7, 8, 8, 9, 15};
    private int[] arr1 = {-3, 1, 2, 2, 3, 5, 7, 8, 9, 9};
    private int[] arr2 = {3, 5, 7, 9, 10, 13, 14};

    private int[] arr0AndArr1 = {-3, -1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 15};
    private int[] arr1AndArr2 = {-3, 1, 2, 2, 3, 3, 5, 5, 7, 7, 8, 9, 9, 9, 10, 13, 14};

    @Test
    public void mergeTest1() throws Exception {

        assertArrayEquals(MergeArrays.merge(arr0, arr1), arr0AndArr1);
        assertArrayEquals(MergeArrays.merge(arr1, arr0), arr0AndArr1);
        assertArrayEquals(MergeArrays.merge(arr1, arr2), arr1AndArr2);
        assertArrayEquals(MergeArrays.merge(arr2, arr1), arr1AndArr2);

    }
}