package day2;

public class linearSearch {

    public static int linearSearchFunction(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if(target==arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,43,67,51,90};
        int target = 90;

        int index = linearSearchFunction(arr, target);
        if(index != -1) {
            System.out.println("Target found at "+index);
        }else {
            System.out.println("Target not found");
        }
        
    }
}
