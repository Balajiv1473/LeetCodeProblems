class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int count = 0;
        int c = 0;
        int f = 0;
        for (int i = 0; i < n - 1; i++) {
            f = Math.max(f, i + nums[i]);
            if (i == c) {
                count++;
                c = f;
            }
        }
        return count;
    }
}