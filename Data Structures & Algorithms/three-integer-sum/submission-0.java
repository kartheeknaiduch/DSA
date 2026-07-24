class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {

            Set<Integer> hash = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int target = -(nums[i] + nums[j]);
                if (hash.contains(target)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], target);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                hash.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}