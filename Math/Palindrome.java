import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int res=0;
        while(x>0){
            int k=x%10;
            res=res*10+k;
            x/=10;
        }
        if(res==num){
            return true;
        }
        else{
            return false;
        }
    }
    
}