class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] a = nums.stream().mapToInt(Integer::intValue).toArray();

        int c = 0;

        for (int l = 0; l < a.length; l++) {
            for (int r = l + 1; r < a.length; r++) {
                int sum = a[l] + a[r];

                if (sum < target) {
                    c++;
                }
            }
        }

        return c;
    }
}