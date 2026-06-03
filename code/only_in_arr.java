package com.yihui.test;

import java.util.Random;

//需求（力扣算法）：先获取10个0-100之间的随机数并存入到数组当中，要求保证数据是唯一的
public class only_in_arr {
    public static void main(String[] args) {
        Random r =new Random();
        int[] arr=new int[10];
        arr[0]=r.nextInt(0,101);
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(0,101);
            if (arr[i] != num){
                arr[i] = num;
                continue;
            }
            i--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
