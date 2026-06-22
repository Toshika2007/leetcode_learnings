class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int d=0;
        for(int i=0;i<n;i++){
            String s=String.valueOf(nums[i]);
            int len=s.length();
            if(len%2==0){
                d++;
            }
        }
        return d;
    }
}