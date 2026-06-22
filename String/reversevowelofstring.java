class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j){
            if(((a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')||
               (a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'))&&
               ((a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u')||
               (a[j]=='A'||a[j]=='E'||a[j]=='I'||a[j]=='O'||a[j]=='U'))){
                    char tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                    i++;
                    j--;
               }
               else if((a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')||
               (a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')){
                 j=j-1;
               }
               else{
                 i=i+1;
               }
        }
     return new String(a);        
    }
}