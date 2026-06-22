class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
       int c=1;
       int k=0;
       int d=0;
        while(i<n){
            c=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
                
            }
            if(c>=1){
                nums[k]=nums[i];
                k++;
                d++;
            }
            i=i+c;
        }
        return d;
    }
}