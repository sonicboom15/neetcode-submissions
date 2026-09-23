class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> bucket = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
    		bucket.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (bucket.containsKey(complement) && bucket.get(complement) != i) {
                return new int[]{i, bucket.get(complement)};
            }
        }

        return new int[0];
    }
}
