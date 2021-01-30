class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        if (n == 0) return 0;
        
        int[] leftheight = new int[n];
        int[] rightheight = new int[n];
        
        
        
        leftheight[0] = height[0];
        
        for (int i = 1; i < n; i++){
            leftheight[i] = height[i]>leftheight[i-1]?height[i]:leftheight[i-1];
        }
        rightheight[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--){
            rightheight[i] = height[i]>rightheight[i+1]?height[i]:rightheight[i+1];
        }
        
        int sum = 0;
        for (int i = 1; i < n; i++){
            int left = leftheight[i];
            int right = rightheight[i];
            sum += (left < right ? left:right) - height[i];
        }
        return sum;
    }
}
