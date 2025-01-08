/*leetcode question number 754(medium)*/
public class ReachaNumber {
    public static void main(String[] args) {
     ReachaNumber r=new ReachaNumber();
     int ans=r.reachNumber(3);
        System.out.println(ans);
    }
    public static int reachNumber(int target) {
        target = Math.abs(target);

        int low = 0;
        int high = (int) (Math.sqrt(2 * target)) + 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sumToMid = (long) mid * (mid + 1) / 2;

            if (sumToMid == target) {
                return mid;
            } else if (sumToMid > target) {
                long diff = sumToMid - target;
                if (diff % 2 == 0) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }

        long sumToLow = (long)low * (low + 1) / 2;
        long diff = sumToLow - target;
        if (diff % 2 == 0) {
            return low;
        } else {
            if ((sumToLow + (low + 1) - target) % 2 == 0) {
                return low + 1;
            } else {
                return low + 2;
            }
        }

    }
}
