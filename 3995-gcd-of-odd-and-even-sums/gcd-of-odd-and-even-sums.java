class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e =0,o=0;
        int c =0;
        for(int i =1;c<n;i++){
            if(i%2!=0){
                o+=i;
                c++;
            }
        }
            c=0;
            for(int i =1;c<n;i++){
            if(i%2==0){
                e+=i;
                c++;
            }
        }
        int m = Math.min(e,o);
        for(int i=m;i>0;i--){
            if(e%i==0&&o%i==0){
                return i;
            }
        }
       return -1; 
    }
}