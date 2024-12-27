/*leetcode question number 1095 array(hard)*/
class leetcode1095 {
    public int findInMountainArray(int target, int[] mountainArr) {
        // Step 1: Find the peak of the mountain array
        int peak = findPeak(mountainArr);

        // Step 2: Perform binary search on the ascending part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Step 3: Perform binary search on the descending part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length - 1, false);
    }

    // Helper method to find the peak of the mountain array
    private int findPeak(int[] mountainArr) {
        int left = 0, right = mountainArr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mountainArr[mid] < mountainArr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // Peak index
    }

    // Helper method for binary search
    private int binarySearch(int[] mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = mountainArr[mid];

            if (midValue == target) return mid;

            if (ascending) { // Ascending part
                if (midValue < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else { // Descending part
                if (midValue > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    // Main method for testing
    public static void main(String[] args) {
        leetcode1095 solution = new leetcode1095();

        // Example mountain array
        int[] mountainArr = {1, 2, 3, 5, 3, 1};
        int target = 3;

        // Call the function and print the result
        int result = solution.findInMountainArray(target, mountainArr);
        System.out.println("Index of target: " + result);
    }
}
