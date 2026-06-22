class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int n1=word2.length();
        int i=0;
        int j=0;
        String m="";
        while(i<n&&j<n1){
            m+=word1.charAt(i);
            m+=word2.charAt(j);
            i++;
            j++;
        }
        while(i<n){
            m+=word1.charAt(i);
            i++;
        }
        while(j<n1){
            m+=word2.charAt(j);
            j++;
        }
        return m;
    }
}