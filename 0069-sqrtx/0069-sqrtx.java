class Solution {
    public int mySqrt(int x) {
        //double y = Math.sqrt(x);
        //return (int)Math.sqrt(x);
        int first = 1;
        int last = x;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return last;
    }

}