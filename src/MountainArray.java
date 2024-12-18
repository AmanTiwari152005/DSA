/*leetcode question number 852 from array(medium)*/

public class MountainArray {

    public static void main(String [] args){
        int []arr={1,2,3,5,6,8,9,20,80,20,9,8,5,4,2,1};
            int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

        public static int peakIndexInMountainArray(int[] arr) {
          int start=0;
          int end=arr.length-1;

            while(start<end) {
                int mid = start + (end - start) / 2;

                if(arr[mid]>arr[mid+1]){
                    //in decreasing part of array
                    //this may be the answer but look at left
                    end=mid;
                }else{
                    start=mid+1;
                }

            }
            return start;


    }
}
