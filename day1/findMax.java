
package day1;

public class findMax {
    public static void main(String[] args) {
        int[] arr = {1,4,34,62,21,42};

        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if ( arr[i] >  max ){
                max = arr[i];
            }
        }
        System.out.print("Max Element is "+max);
    }
}


// Time : O(n) - Since there is only scan of loop
// Space : O(1) - Variable max
