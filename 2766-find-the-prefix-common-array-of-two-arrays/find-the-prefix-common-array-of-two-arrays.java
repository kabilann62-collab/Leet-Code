class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        for(int i=0;i<A.length;i++){
            m1.put(A[i],i);
        }
        for(int i=0;i<B.length;i++){
            m2.put(B[i],i);
        }
        int [] a  = new int[A.length];
        int sum =0;
        for(int i=0;i<A.length;i++){
           if(i>=m2.get(A[i])){
            sum++;
           }
           if(i>m1.get(B[i])){
            sum++;
           }
           a[i]=sum;
        }
      return a;  
    }
}