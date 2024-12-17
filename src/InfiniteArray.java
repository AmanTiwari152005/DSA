public class InfiniteArray {
    public static void main(String [] args){
        int []nums={1,2,3,5,6,8,9,20,80,90,110,190,200,300,400,500};
        int target=10;
        System.out.println(search(nums,target));
    }

    public static int search(int [] nums,int target){
        int start=0;
        int end=1;


        while(target >nums[end]){
            int temp=end+1; //new start

            end=end + (end-start) * 2;
            start=temp;

        }
        return binarysearch(nums,target,start,end);
    }

    public static int binarysearch(int [] nums,int target,int start ,int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target < nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
