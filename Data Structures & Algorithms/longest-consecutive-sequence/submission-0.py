class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        mp = set(nums)
        res = 1
        for num in mp:
            if num - 1 not in mp:
                target = num
                seq = 0
                while target in mp:
                    target += 1
                    seq += 1
                if seq > res:
                    res = seq
        return res
