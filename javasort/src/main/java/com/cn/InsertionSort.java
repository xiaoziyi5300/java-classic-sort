package com.cn;

/**
 * @Auther: lzf
 * @Date: 2018/12/17 0017 10:29
 * @Description: 插入排序
 */
public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 7, 34, 28, 16};
        PrintUtil.printArr(arr, "排序前");
        PrintUtil.printArr(insertionSort(arr, arr.length), "排序后");
    }

    /**
     * 原理：
     * 1：将指针指向某个元素，假设该元素左侧的元素都为有序元素，将该元素抽取出来，然后按照从右往左的顺序分别与其左边的元素做比较，遇到比其大的元素便将其右移，
     * 直到找到比该元素小的元素或者找打最左边的的元素都比它大 结束
     * 2：此时会出现一个空位，将该元素放入空位中，此时该元素左侧的元素都比它小，右侧的元素都比它大
     * 3：指针向后移动一位，重复上述过程。每操作一轮，左侧的元素都增加一个,右侧的元素都减少一个
     * <p>
     * 编码分析 :
     * 需要2层循环，第一层循环index表示上述例子中的指针，即遍历从下标为1开始的每一个元素；第二层循环从leftindex = index -1开始，
     * leftindex-- 向左遍历，将每一个元素都与i处元素进行比较，直到j处的元素小于i处的元素或者leftindex < 0
     * 遍历从i到j的每一个元素右移动，最后将index处的元素放到leftindex位置上
     *
     * @auther: lzf
     * @date: 2018/12/17 0017 10:54
     */
    public static int[] insertionSort(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int leftindex = i - 1;
            while (leftindex >= 0 && arr[leftindex] > temp) {
                arr[leftindex + 1] = arr[leftindex];
                leftindex--;
            }
            arr[leftindex + 1] = temp;
        }
        return arr;
    }
}
