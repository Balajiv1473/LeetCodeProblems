class Solution {
    public int maxProfit(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int max = 0;
        int min = arr[0];
        int n = arr.length;
        
        for (int i = 1; i < n; i++) { 
            if (arr[i] < min) {
                min = arr[i];
            } 
            int profit = arr[i] - min;
            if (profit > max) {
                max = profit;
            }
        }
        
        return max;    
    }
}
