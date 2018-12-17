package com.cn;

/**
 * @Auther: lzf
 * @Date: 2018/12/17 0017 14:39
 * @Description: 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 7, 34, 28, 16, 1};
        PrintUtil.printArr(arr, "排序前");
        PrintUtil.printArr(selectSort(arr, arr.length), "排序后");
    }

    /**
     * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
     * 算法描述：
     * 初始状态：无序区为R[1..n]，有序区为空；
     * 第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，
     * 将它与无序区的第1个记录R交换，使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
     * n-1趟结束，数组有序化了。
     *
     * @auther: lzf
     * @date: 2018/12/17 0017 14:41
     */
    public static int[] selectSort(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (arr[j] < arr[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
