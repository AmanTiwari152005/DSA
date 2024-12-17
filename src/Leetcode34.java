
/*leetcode question number 34 from arrays (medium)*/

import java.util.Scanner;

public class Leetcode34 {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] nums=new int[7];
        System.out.println("Enter the elements of an array");
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();

        Leetcode34 l=new  Leetcode34();

         int[] result = l.searchRange(nums, target);
        System.out.println("Start Index: " + result[0]);
        System.out.println("End Index: " + result[1]);
    }

    public int[] searchRange(int[] nums,int target) {
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    int search(int[] nums,int target,boolean findStartIndex){


int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target < nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                ans= mid;
                if(findStartIndex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;

    }
}
