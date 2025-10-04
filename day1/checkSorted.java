package day1;

import java.util.Arrays;

public class checkSorted {
    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 3, 1};
        System.out.println(Arrays.toString(arr));

        boolean ascending = true;
        boolean descending = true;

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1] > arr[i]) {
                descending = false;
            }
            if(arr[i+1]< arr[i]) {
                ascending = false;
            }
        }

        if(ascending) {
            System.out.println("Array is in ascending order");
        }else if(descending){
            System.out.println("Array is in descending order");
        }else {
            System.out.println("Array is not sorted");

        }
    }
}
