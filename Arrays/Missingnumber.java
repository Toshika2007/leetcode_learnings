class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int max=n-1;
        Arrays.sort(nums);
        for(int i=0;i<=max;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return max+1;
       
    }
}