/*leetcode question number 153 from array (medium)*/
public class MininRSA {
    private static int[] arr;

    public static void main(String[] args) {
           int [] nums={3,4,5,1,2};

           MininRSA m=new MininRSA();
          int i= m.find(nums);
        System.out.println(i);

    }
    public static int findPivot ( int[] nums){
        int start = 0;
        int end = nums.length - 1;

        // Check if array is already sorted
        if (nums[start] < nums[end]) {
            return -1; // No rotation
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check for pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Adjust search bounds
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // No pivot found

    }

    public static int find(int[] nums) {
        int pivot = findPivot(nums);

        // If pivot is -1, the array is not rotated, return the first element
        if (pivot == -1) {
            return nums[0];
        }

        // The minimum value is the element after the pivot
        return nums[(pivot + 1) % nums.length];
    }

}
