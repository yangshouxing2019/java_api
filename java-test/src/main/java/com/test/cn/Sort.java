package com.test.cn;

import java.util.Arrays;

public class Sort {
    public static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{45,6,78,9,12};
        Sort.bubbleSort(arr);
        System.out.println("从小到大排序为："+Arrays.toString(arr));
    }
}
