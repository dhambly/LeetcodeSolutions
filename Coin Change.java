class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] best = new int[amount+1];
        Arrays.fill(best, amount+1);
        best[0] = 0;
        for (int i = 1; i <= amount; i++){
            
            for (int c : coins){
                if (c > i) continue;
                best[i] = Math.min(best[i], best[i-c] + 1 );
            }
            
        }
        return best[amount] <= amount ? best[amount] : -1;
    }
}
