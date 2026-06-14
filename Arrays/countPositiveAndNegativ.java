class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int c=0,d=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                c++;
            }
            else if(nums[i]>0){
                d++;
            }
        }
        if(d<c){
            return c;
        }
        else{
            return d;
        }
    }
}