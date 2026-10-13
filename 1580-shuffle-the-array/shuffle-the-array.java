class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] a = new int[nums.length];
        a[0] = nums[0];
        int c = n;
        int t =0;
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                a[i] = nums[n-c];
                c--;
            }
            else
            {
               a[i] = nums[n+t];
               t++;
            }
        }
       return a; 
    }
}