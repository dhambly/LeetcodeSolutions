class Solution {
    public int missingNumber(int[] nums) {
        //The idea is we take the largest possible number and XOR it with every number in the array
        //We also XOR it with every index in the array
        //What this does is every matching number and index will cancel each other
        //This leaves 1 index that did not get cancelled, our answer.
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++){
            ans ^= nums[i];
            ans ^= i;
        }
        return ans;
    }
}
