class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        char[] st=s.toCharArray();
        char[] st2=t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(st2);
        if(Arrays.equals(st,st2)){
            return true;
        }
        return false;
    }
}