package com.cn;

import java.util.Arrays;

/**
 * @Auther: lzf
 * @Date: 2018/12/17 0017 15:22
 * @Description: 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 7, 34, 28, 16, 1};
        PrintUtil.printArr(arr, "排序前");
        PrintUtil.printArr(mergeSort(arr), "排序后");
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }
}
