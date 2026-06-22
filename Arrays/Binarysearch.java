class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int f=0;
        int mid=0;
        while(i<=j){
             mid=(i+j)/2;
            if(nums[mid]==target){
                f=1;
                return mid;
            }
            else if(nums[mid]>target){
                j=j-1;
            }
            else{
                i=i+1;
            }
        }
        
        if(f==0){
            return -1;
        }
        else{
            return mid;
        }
    }
}