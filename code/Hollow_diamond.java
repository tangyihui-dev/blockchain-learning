package com.yihui.test;

public class Hollow_diamond {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = i; j <=1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i*2-1; j++) {
                System.out.print(" ");
            }
            if (i>0) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <=i*2-1; j++) {
                System.out.print(" ");
            }
            if (i<2) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
