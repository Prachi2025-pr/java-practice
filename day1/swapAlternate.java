package day1;

import java.util.Arrays;

public class swapAlternate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        int temp;
        
        for(int i=0;i<arr.length-1;i+=2) {
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i]= temp;
        }

        System.out.print("Array after swapping elements: "+Arrays.toString(arr));
    }

}
