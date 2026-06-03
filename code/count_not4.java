package com.yihui.test;

import java.util.Scanner;

public class count_not4 {
    public static void main(String[] args) {
        //在一行中输入一个正整数n，满足1<=n<=100000
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = 0;
        while (true) {
            n = sc.nextInt();
            if(n > 0 && n <= 100000){
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }
        
        for (int i = 1; i <= n; i++) {
            // 判断是否是4的倍数
            if (i % 4 == 0) {
                continue;
            }
            
            // 判断每一位是否包含4
            boolean hasFour = false;
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 4) {
                    hasFour = true;
                    break;
                }
                temp /= 10;
            }
            
            if (hasFour) {
                continue;
            }
            
            System.out.println(i);
        }
    }
}

