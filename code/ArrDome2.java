package com.yihui.test;
//合并有序数组（力扣算法）
//给你两个有序数组 arr1 和arr2
//将两个数组中的数据合并到一个大数组中。
//要求：合并之后的大数组也是有序的
//举例1：
//arr1：13579
//arr2:246810
//arr3:12345678910
public class ArrDome2 {
    public static void main(String[] args) {
    //创建两个数组
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = new int[arr1.length+arr2.length];
        int len = arr1.length+arr2.length;
    //创建循环加入第三个数组
        for (int i = 0; i < 5; i++) {
            //判断两个数组的元素大小
            if(arr1[i]<arr2[i]){
                arr3[i*2] = arr1[i];
                arr3[i*2+1] = arr2[i];
            }else {
                arr3[i*2] = arr2[i];
                arr3[i*2+1] = arr1[i];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
