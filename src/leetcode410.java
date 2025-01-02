//leetcode question 410 from array(hard)
public class leetcode410 {
    public static void main(String[] args) {
         int [] nums={7,2,5,10,8};
         leetcode410 l=new leetcode410();
         int result=l.splitArray(nums,2);
        System.out.println(result);
    }
    public static int splitArray(int[] nums,int m){
        int start=0;
        int end=0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);//int the end of the loop it will contain the max item from the array..
            end += nums[i];
        }

        //binary search
        while(start < end){
            //try for the middle as potential answer
            int  mid=start +(end-start)/2;

            //calculate how many pieces you can divide this in with this max sum.
            int sum=0;
            int pieces=1;
            for(int num : nums){
                if(sum + num >mid){
                    //you vcannot add this in this subarray,make new one
                    //say you can add this number in  subarray,then sum = num
                    sum = num;
                    pieces ++;
                }else{
                    sum += num;

                }

            }
            if(pieces > m){
                start = mid +1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}
