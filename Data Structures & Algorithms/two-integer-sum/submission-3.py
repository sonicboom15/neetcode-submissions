class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        freq_map = {val: idx for idx, val in enumerate(nums)}
        for i, num in enumerate(nums):
            if (target - num) in freq_map and freq_map[target - num] != i:
                return [i, freq_map[target - num]]