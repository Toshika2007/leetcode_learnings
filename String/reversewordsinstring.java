class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] st=s.split("\\s+");
        int n=st.length;
        
        Stack<String>stack = new Stack<>();
        for(int i=0;i<n;i++){
           stack.push(st[i]);
        }
        StringBuilder k=new StringBuilder();
       while(!stack.isEmpty()){
            k.append(stack.pop());
            if(!stack.isEmpty()){
                k.append(" ");
            }
        }
        return k.toString();
    }
}