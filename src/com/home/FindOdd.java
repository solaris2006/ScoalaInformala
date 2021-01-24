package com.home;

public class FindOdd {
    public static int findIt(int[] a) {
        int counter = 0;
        int odd = 0;
        int temp;

        for (int i = 0 ; i < a.length; i++){
            temp = a[i];
            for (int j = 0; j < a.length; j++ ){
                if (a[j]  == temp){
                    counter++;
                }
            }
            if (counter % 2 != 0){
                odd = a[i];
                break;
            }
            counter = 0;


        }
        return odd;
    }

    }
