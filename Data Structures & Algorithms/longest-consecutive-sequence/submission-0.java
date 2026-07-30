class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for(int n : nums) set.add(n);
        for(int n: nums){
            int streak = 0 ;
            int current = n;
            while(set.contains(current)){
                streak++;
                current++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
