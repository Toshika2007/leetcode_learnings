class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split(" ");
        int k=st.length;
        String sol=st[k-1];
        return sol.length();
    }
}