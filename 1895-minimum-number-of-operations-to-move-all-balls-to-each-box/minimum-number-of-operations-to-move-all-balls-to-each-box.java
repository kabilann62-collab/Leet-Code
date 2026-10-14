class Solution {
    public int[] minOperations(String boxes) {
        int [] a = new int[boxes.length()];
        int sum =0;
        int l=0,r=0;
        r=l+1;
        while(l<boxes.length()){
            if(r==boxes.length()){
                a[l]=sum;
                sum =0;
                r=0;
                l++;
            }
            if(l!=r&&boxes.charAt(r)=='1'){
                sum += Math.abs(l-r);
                r++;
            }
            else{
                r++;
            }
        }
     return a;   
    }
}