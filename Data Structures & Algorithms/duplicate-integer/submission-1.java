class Solution {
    public boolean hasDuplicate(int[] nums) {
		Integer[] integerNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Set<Integer> duplicateChecker = new HashSet<>(Arrays.asList(integerNums));
		if(duplicateChecker.size()!=nums.length){
			return true;
		}
		return false;
    }
}
