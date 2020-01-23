package com.lambton;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
//        int a[] = new int[10];
//        a[0] = 4;
//        System.out.println(a[0]);
//        int d[] = new int[]{1,2,3};
//        d[1] = 5;
//        System.out.println(d[1]);
//        System.out.println(d.length);
//
//        for(int x:d){
//            System.out.println(x);
//        }
//
//
//        int[] x4[] = {{1,2},{3,6,7}};
//        System.out.println(x4);
//        for(int[] row: x4){
//            for(int val: row){
//                System.out.print(val+" ");
//            }
//            System.out.println();
//        }

    int a[] = new int[]{1,3,4,5,2,3,4};

    ArrayExample obj = new ArrayExample();
    System.out.println(obj.max(a));
    System.out.println(obj.min(a));
    System.out.println(obj.summ(a));
    System.out.println(obj.avg(a));



    }


    public int max(int [] arr){
        int max = -1;
        for(int val: arr){
            if(val > max){
                max = val;
            }
        }
        return max;
    }

    public int min(int [] arr){
        int min = arr[0];
        for(int val: arr){
            if(val < min){
                min = val;
            }
        }
        return min;
    }

    public int summ(int [] arr){
        int sum = 0;
        for(int val: arr){
            sum +=val;
        }
        return sum;
    }

    public float avg(int [] arr){
        int sum = this.summ(arr);
        return (float)sum/(arr.length);
    }







}
