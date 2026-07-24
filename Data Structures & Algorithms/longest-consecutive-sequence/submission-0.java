

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int n = nums.length;
        Map<Integer, Integer> lcs = new HashMap<>();

        lcs.put(nums[0], 1);

        for (int i = 1; i < n; i++) {

          
            if (nums[i] == nums[i - 1])
                continue;

            if (nums[i] - nums[i - 1] == 1) {
                lcs.put(nums[i], lcs.get(nums[i - 1]) + 1);
            } else {
                lcs.put(nums[i], 1);
            }
        }

        return Collections.max(lcs.values());
    }
}