class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int n1=t.length();
        int i=0;
        int j=0;
       while(i<n&&j<n1){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        j++;
       }
       return i==n;
    }
}