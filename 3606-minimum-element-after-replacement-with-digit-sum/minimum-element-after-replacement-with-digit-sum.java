class Solution {
    public int minElement(int[] nums) {
        int m = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int t = nums[i];
            int s = 0;
            while(t!=0){
                s+=t%10;
                t/=10;
            }
            m = Math.min(m,s);
        }
      return m;  
    }
}