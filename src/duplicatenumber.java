/*leetcode question number 287(medium)*/
public class duplicatenumber {

        public int findDuplicate(int[] nums) {
            int low = 1, high = nums.length - 1; // Range from 1 to n-1

            while (low < high) {
                int mid = low + (high - low) / 2;

                // Count how many numbers are ≤ mid
                int count = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] <= mid) {
                        count++;
                    }
                }

                // If count > mid, the duplicate is in the lower half
                if (count > mid) {
                    high = mid; // Search the lower half
                } else {
                    low = mid + 1; // Search the upper half
                }
            }

            return high; // When low == high, we've found the duplicate
        }

        public static void main(String[] args) {
            duplicatenumber solution = new duplicatenumber();
            int[] nums = {4, 3, 2, 7, 5, 2, 1}; // Example array
            System.out.println("Duplicate number is: " + solution.findDuplicate(nums)); // Output: 2
        }
    }

