class Solution {
    public int reverseDegree(String s) {
        int v = 26;
        Map<Character,Integer> m = new HashMap<>();
        for(int i = 97;i<=123;i++)
        {
            m.put((char)i,v);
            v--;
        }
       int sum =0;
       
       for(int i=0;i<s.length();i++){
          sum+=m.get(s.charAt(i))*(i+1);
       }

     return sum;   
    }
}