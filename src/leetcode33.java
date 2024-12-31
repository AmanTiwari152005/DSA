/*leetcode question 33 from array(medium)*/
public class leetcode33 {
    public static void main(String[] args) {
      int [] arr={4,5,6,7,0,1,2};
      int target=6;

      leetcode33 l=new leetcode33();
      int result=l.search(arr,target);
        System.out.println(result);
    }


        public int search(int[] arr, int target) {
            if (arr == null || arr.length == 0) {
                return -1; // Handle empty array
            }

            int pivot = findPivot(arr);

            // If no pivot found, array is not rotated
            if (pivot == -1) {
                return binarySearch(arr, target, 0, arr.length - 1);
            }

            // If target is the pivot
            if (arr[pivot] == target) {
                return pivot;
            }

            // Determine which part to search
            if (target >= arr[0]) {
                return binarySearch(arr, target, 0, pivot - 1);
            }
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

        private int binarySearch(int[] arr, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

        private int findPivot(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            // Check if array is already sorted
            if (arr[start] < arr[end]) {
                return -1; // No rotation
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check for pivot
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }

                // Adjust search bounds
                if (arr[start] >= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1; // No pivot found
        }
    }


