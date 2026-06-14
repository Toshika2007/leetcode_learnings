class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int d=0;
        for(int i=0;i<n;i++){
            int c=0;
            int k=nums[i];
            while(k>0){
                c++;
                k/=10;
            }
            if(c%2==0){
                d++;
            }
        }
        return d;
    }
}