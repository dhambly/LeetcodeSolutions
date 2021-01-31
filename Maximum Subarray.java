class Solution {
    public int maxSubArray(int[] nums) {
        //The goal is to find the best streak of numbers in a row
        int n = nums.length;
        int max = nums[0];
        int curmax = nums[0];
        
        for (int i = 1; i < n; i++){
            //Curmax is our "current streak" which will end if its worse than just the next number alone. aka if its negative vs positive
            //or just "more negative"
            curmax = Math.max(nums[i], nums[i]+curmax);
            //check to see if this streak is the best streak
            max = Math.max(max,curmax);
        }
        return max;
    }
}
