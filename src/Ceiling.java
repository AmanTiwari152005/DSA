import java.util.Scanner;

public class Ceiling{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[7];
        System.out.println("Enter the elements of an array");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();

        int ans=ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target < arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
/*
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // Edge case: When target is greater than the greatest element in the array
        if (start >= arr.length) {
            return -1; // No ceiling found
        }

        return start;
    }
}

*/
