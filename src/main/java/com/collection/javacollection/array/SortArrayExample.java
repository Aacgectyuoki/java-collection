package com.collection.javacollection.array;

public class SortArrayExample {

    public static void main(String[] args) {

        int temp;
        int[] arr = {36, 19, 29, 12, 5};

        // [19,36,29,12,5]


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }


    }

