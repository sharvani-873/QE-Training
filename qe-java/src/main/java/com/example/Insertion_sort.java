package com.example;

public class Insertion_sort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }

        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
