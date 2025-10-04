package day1;

public class countEvenOdd {
    public static void main(String[] args) {
        
        int evenCount = 0;
        int oddCount = 0;

        int arr[] = {1,2,3,5,6,7,8};

        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even count "+evenCount);
        System.out.println("Odd count "+oddCount);

    }
}
