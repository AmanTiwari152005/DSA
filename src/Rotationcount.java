public class Rotationcount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(arr);//this will return the index number of pivot..
        int ans=pivot + 1;//add 1 in the above answer ...
        System.out.println("The Rotation Count is:-" + " " + ans);
    }
    //this function will return the index number of pivot..
        public static int findPivot ( int[] arr){
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

