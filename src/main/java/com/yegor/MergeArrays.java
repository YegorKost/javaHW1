package com.yegor;

import java.util.Arrays;

/**
 * This class contains method for merging two sorted arrays.
 * Created by YegorKost on 24.01.2017.
 */
public class MergeArrays {

    /**
     * This method merges two sorted arrays.
     * @param arr0 ascending sorted array
     * @param arr1 ascending sorted array
     *
     * @return merged array
     * */
    public static int[] merge(int[] arr0, int[] arr1) {
        int[] result = new int[arr1.length + arr0.length];

        System.out.println("arr0 - " + Arrays.toString(arr0));
        System.out.println("arr1 - " + Arrays.toString(arr1));

        int index0 = 0;
        int index1 = 0;

//        while (index0 + index1 != result.length - 2)
//        if have situation (and some other situations) when: arr0.length = 4, arr1.length = 5, result.length = 9,
//        index0 = 3 and index1 = 4 then conditions in the while loop dos't work correctly
        while (true) { // - this loop breaks in "if" statement.

            if (index0 < arr0.length && index1 < arr1.length) {

                if (arr0[index0] <= arr1[index1]) {
                    result[index0 + index1] = arr0[index0++];
                } else {
                    result[index0 + index1] = arr1[index1++];
                }

            } else if (index0 == arr0.length) {

                index0 = arr0.length - 1;
                System.arraycopy(arr1, index1, result, index1 + index0 + 1, arr1.length - index1);
                index1 = arr1.length - 1; // - is never used
                break; // - breaks while loop when one of arrays copied to the result array

            } else if (index1 == arr1.length) {

                index1 = arr1.length - 1;
                System.arraycopy(arr0, index0, result, index1 + index0 + 1, arr0.length - index0);
                index0 = arr0.length - 1; // - is never used
                break; // - breaks while loop when one of arrays copied to the result array

            }
            System.out.println("---" + Arrays.toString(result));
        }

        System.out.println("--" + Arrays.toString(result) + "--" + "\n");
        return result;
    }

    public static void main(String[] args) {
        MergeArrays e = new MergeArrays();
        int[] arr0 = {-1,2, 4, 6, 7, 13, 15, 16, 18};
        int[] arr1 = {-3, 1, 2, 6, 8, 9, 11};

        System.out.println(Arrays.toString(MergeArrays.merge(arr0, arr1)));

    }

}
