/*leetcode problem 154 (hard)*/
public class mininduplicatersa {

    public static void main(String[] args) {
        int [] nums={2,2,0,1};
        mininduplicatersa m=new mininduplicatersa();
        int ans=m.findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid is greater than end, minimum is in the right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            // If mid is smaller than end, minimum is in the left half
            else if (nums[mid] < nums[end]) {
                end = mid;
            }
            // When nums[mid] == nums[end], reduce end to eliminate duplicates
            else {
                end--;
            }
        }

        return nums[start]; // The start pointer now points to the minimum
    }
}
