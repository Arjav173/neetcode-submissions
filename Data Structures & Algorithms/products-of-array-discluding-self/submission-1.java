class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []res = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            res[i] = product(nums,i);
        }
        return res;
    }
    public int product(int []nums,int n){
        int sum = 1;
        for(int i = 0;i< nums.length;i++){
            if(i!=n)sum*=nums[i];
        }
        return sum;

    }
}  
