class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] a =new int[nums.length];
        int [] b =new int[nums.length];
        int [] c =new int[nums.length];
        int sum =nums[0];
        a[0] = 0;
        b[b.length-1]=0;
        for(int i=1;i<a.length;i++){
              a[i]=sum;
              sum+=nums[i];
        }
         sum = nums[nums.length-1];
        for(int i = b.length-2;i>=0;i--){
            b[i] = sum;
            sum+=nums[i];
        }
        for(int i =0;i<c.length;i++){
            c[i] = Math.abs(a[i]-b[i]);
        }
        return c;
    }
}