package com.lesson.lesson2;

import java.util.Random;

public class Main {
    static Random rnd = new Random();
    static final int SIZE = 1000000;

    public static void main(String[] args) {
        int[] myArr = new int[SIZE];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rnd.nextInt(10);
        }
        //System.out.println(toString(myArr));
       // selectionSort(myArr);
        //insertionSort(myArr);
       bubbleSort(myArr);

    }

    private static void bubbleSort(int[] list) {

        for (int i = SIZE - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list[j + 1] < list[j]) {
                    int buffer = list[j+1];
                    list[j+1] = list[j];
                    list[j] = buffer;

                }
            }
        }
        System.out.println(toString(list));
    }


    private static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j > 0 && list[j] < list[j - 1]) {
                int buffer = list[j];
                list[j] = list[j - 1];
                list[j - 1] = buffer;
                j--;
            }

        }

        System.out.println(toString(list));
    }

    private static void selectionSort(int[] list) {
        for (int i = 0; i < SIZE - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < SIZE; j++) {
                if (list[j] < list[imin]) {
                    imin = j;
                }
            }
            int buffer = list[i];
            list[i] = list[imin];
            list[imin] = buffer;
        }
        System.out.println(toString(list));
    }

    private static String toString(int[] list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE - 1; i++) {
            sb.append(list[i] + ", ");
        }
        sb.append(list[SIZE - 1]);
        return sb.toString();
    }

}
