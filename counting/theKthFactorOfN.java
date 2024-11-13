class Solution {
    public int kthFactor(int n, int k) {

        // O(n) - Counting with a condition aka early stopping in iteration
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (count == k) {
                    return i;
                } else {
                    count++;
                }
            }
        }
        return -1;
    }
}