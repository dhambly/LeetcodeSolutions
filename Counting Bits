class Solution {
    public int[] countBits(int num) {
        //The basic idea is you use the trick that a number shifted to the left is actually double
        //So 10010 / 2 = 1001
        //We could use i>>2 and i&1 as well
        int[] ans = new int[num+1];
        for (int i = 1; i <=num; i++){
            ans[i] = ans[i/2] + i%2;
        }
        return ans;
    }
}
