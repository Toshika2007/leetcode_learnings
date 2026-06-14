class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int add=0;
            for(int j=0;j<accounts[i].length;j++){
                 add=add+accounts[i][j];
            }
            if(add>sum){
                sum=add;
            }
        }
        return sum;
    }
}