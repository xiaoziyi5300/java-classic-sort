package com.cn;

/**
 * @Auther: lzf
 * @Date: 2018/12/17 0017 13:55
 * @Description: 冒泡排序
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 7, 34, 28, 16, 1};
        PrintUtil.printArr(arr, "排序前");
        PrintUtil.printArr(bubbleSort(arr, arr.length), "排序后");
    }

    /**
     * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     * 原理：
     * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
     * 如果它们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需要交换，
     * 也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端
     * <p>
     * 算法描述:
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 针对所有的元素重复以上的步骤，除了最后一个；
     * 重复步骤1~3，直到排序完成。
     *
     * @auther: lzf
     * @date: 2018/12/17 0017 14:25
     */
    public static int[] bubbleSort(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}