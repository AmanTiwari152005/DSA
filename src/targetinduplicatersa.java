/*leetcode question number 81(medium)*/
public class targetinduplicatersa {
    public static void main(String[] args) {
        targetinduplicatersa t = new targetinduplicatersa();

        int[] nums = {4, 5, 6, 6, 7, 0, 1, 2};
        boolean ans = t.search(nums, 7);
        System.out.println(ans);

    }


    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the mid element is the target
            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates: shrink the bounds if start, mid, and end are the same
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            // Check which side is sorted
            if (nums[start] <= nums[mid]) { // Left side is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Target is in the left part
                } else {
                    start = mid + 1; // Target is in the right part
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // Target is in the right part
                } else {
                    end = mid - 1; // Target is in the left part
                }
            }
        }

        return false; // Target not found
    }
}

