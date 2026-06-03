package com.yihui.test;

import java.util.Scanner;

//（力扣算法）给定一个整数数组 nums 和一个整数目标值 target，
// 请你在该数组中找出和为目标值 target 的那两个整数，并输出它们的数组索引。
//提示：先不用考虑效率问题，两层循环即可完成
//要求1：只要输出第一对满足要求的情况
//要求2：输出所有满足要求的情况
//傑喧1”
//输入：数组nums =[2, 7, 11, 15]target =9
//输出：0, 1
//解释：因为 nums[0]+nums[1]==9，所以结果为0和1
//举例2：
//输入：数组nums = [3, 2, 4]target =6
//输出：1, 2
public class ArrDome1 {
    public static void main(String[] args) {
        //创建Scanner接收键盘输入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数组长度：");
            int len = sc.nextInt();
            int[] arr = new int[len];
            //创建循环接收数组元素
            for (int i = 0; i < len; i++) {
                System.out.println("请输入第" + (i + 1) + "个数：");
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            //创建target接收target值
            System.out.println("请输入target值：");
            int target = sc.nextInt();
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < i; j++) {
                    int nums = arr[i] + arr[j];
                    if (nums == target) {
                        System.out.println(i + "," + j);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                System.out.println("没有满足条件的数");
            }
            System.out.println("是否要重新输入?Y/N");
            String choice = sc.next();
            if ("Y".equals(choice) || "y".equals(choice)) {
                continue;
            } else {
                break;
            }
        }
    }
}
