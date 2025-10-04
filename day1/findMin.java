package day1;
import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        

        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print("Minimum element is :"+min);
        sc.close();
    }
}
