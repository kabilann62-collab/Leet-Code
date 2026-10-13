class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] a = new int[2*n];
        for(int i=0;i<a.length;i++){
            if(i>=n){
                int t = i-n;
                a[i]=nums[t];
            }
            else
            {
                a[i] = nums[i];
            }
        }
       return a; 
    }
}