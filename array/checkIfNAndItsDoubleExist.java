class Solution {

    // O(n^2) - need to optimize
    public boolean checkIfExist(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (twoTimes(arr[i], arr[j])) {
                return true;
            }
        }
    }
    return false;
}

public boolean twoTimes(int a, int b) {
    return a == 2 * b || b == 2 * a;
}
}