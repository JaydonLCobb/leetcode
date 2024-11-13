class Solution {
    public int[] twoSum(int[] nums, int target) {


        // Brute force: O(n^2)
        //// int[] arr = new int[2];
        //for (int i = 0; i < nums.length - 1; i++) {
            //for (int j = i + 1; j < nums.length; j++) {
                // Check sum of two values at each indice
                //if (nums[i] + nums[j] == target) {
                  // return new int[] {i, j};  
                   //// arr[0] = nums[i];
                   //// arr[1] = nums[j];
                   //// return arr;
                }
            }
        }
        //// return 0;
        // return new int[0];  // Return empty if no good
        // ------------------------------------------------
        // O(n) - One pass over the array.
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i<nums.length; i++) {
            int difference = target-nums[i];

            if (map.containsKey(difference)) {
                arr[0] = i;
                arr[1] = map.get(difference);
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}