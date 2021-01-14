package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int koin = 0;

        boolean isOtr = false;
        double[] num = {8, -5, 5, 2, 7, 8, -9, 6, 7, -4, 4, 5, -3, 2, 2};
        for (double num1 : num) {
            if (num1 < 0){
                isOtr = true;

            }else {
                if(isOtr){
                    koin++;
                    sum+=num1;
                }
            }

        }
        System.out.println(Arrays.toString(num));
        System.out.println(sum/koin);
    }
}
