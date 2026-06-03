package com.yihui.test;

import java.util.Scanner;

//查找元素（力扣算法）
//给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
//如果目标值不存在于数组中，打印应插入的位置举例1：
//数据：nums =[1, 3, 5, 6]；target =5
//输出：2
//举例2：
//数据：nums = [1, 3, 5, 6], target =2
//输出：1
//举例3：
//数据：nums = [1, 3, 5, 6], target = 7
//输出：4
public class ArrDome3 {
    public static void main(String[] args) {
        //创建一个有序递增数组
        int[] arr = {1,3,5,6,7,9};
        //创建target接收目标值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标值：");
        int target = sc.nextInt();
        //创建变量接收数组中是否有 target值
        boolean flag = false;
        //创建循环查找target可插入位置
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                System.out.println("输入的target值索引位置为："+i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            for (int i = 0; i < arr.length; i++) {
                if (target < arr[i]){
                    System.out.println("输入的target值应插入位置为："+i);
                }
                }
            }
        if (target > arr[arr.length-1]){
            System.out.println("输入的target值应插入位置为："+arr.length);
        }
        }
    }

