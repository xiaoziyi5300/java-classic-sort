package com.cn;

/**
 * @Auther: lzf
 * @Date: 2018/12/17 0017 10:31
 * @Description:
 */
public class PrintUtil {

    public static void printArr(int[] arr, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ");
        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
    }
}
