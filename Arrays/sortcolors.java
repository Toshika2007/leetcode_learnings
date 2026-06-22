class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
       int i=0;
       int j=n-1;
       while(i<j){
        if(nums[i]>nums[j]){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
        else{
            i++;
        }
       }
      
      Arrays.sort(nums);
    }
}