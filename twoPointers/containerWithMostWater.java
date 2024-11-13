class Solution {
    public int maxArea(int[] height) {

        // O(n^2) bruteforce, too slow
        // if (height.length < 2) return 0;
        // int max = 0;
        // for (int i = 0; i <= height.length - 2; i++) {
        //     for (int j = i + 1; j <= height.length - 1; j++) {
        //         int area = Math.min(height[i], height[j]) * (j - i);
        //         max = Math.max(area, max);
        //         System.out.println("i: " + i + ", j: " + j + ", area: " + area + ", max: " + max);
        //     }
        // }
        // return max;

        // ------------------------------------------------------------------------------------------
        // Two Pointer approach - O(n), one pass over the array.
        int left = 0;
        int right = height.length-1;
        int max = 0;

        if (height.length < 2) return 0; // edge case

        while (left < right) {

           // We take the smaller height between the two values at each pointer indice * difference between the indices.
           int area = Math.min(height[left], height[right]) * (right - left);
           max = Math.max(area, max);

           if (height[left] < height[right]) {
            left++;
           } else {
            right--;
           }
        }
        return max;

    }
}