class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        _nums = set(nums)
        if(len(_nums) == len(nums)):
            return False
        return True