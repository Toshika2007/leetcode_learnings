class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            String k="";
            for(int j=words[i].length()-1;j>=0;j--){
               k+=words[i].charAt(j);
            }
            if(words[i].equals(k)){
                return words[i];
                
            }
            else{
                continue;
            }
        }
        return "";
    }
}