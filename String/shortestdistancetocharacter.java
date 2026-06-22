class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
   
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
              list.add(i);
              
            }
        }
        int[] a=new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
        int k=0;
        int min=a[0];
        int n2=list.size();
        int[] sol=new int[n];
        for(int i=0;i<n;i++){
            min=Math.abs(a[0]-i);
            for(int j=0;j<n2;j++){
               int low=Math.abs(a[j]-i);
               if(low<min){
                 min=low;
               }
            }
            sol[k]=min;
            k++;
        }
        //  int[] sol = new int[n];
        // for(int i = 0; i < n; i++) {
        //     int min = Math.abs(a[0] - i);

        //     for(int j = 1; j < a.length; j++) {
        //         min = Math.min(min, Math.abs(a[j] - i));
        //     }

        //     sol[i] = min;
        // }
        return sol;

    }
}