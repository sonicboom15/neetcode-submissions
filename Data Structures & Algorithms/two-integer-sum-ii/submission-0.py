class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        freq_map = {val: idx for idx, val in enumerate(numbers)}
        for i, num in enumerate(numbers):
            if (target - num) in freq_map and freq_map[target - num] != i:
                if(i+1<freq_map[target - num]+1):
                    return [i+1, freq_map[target - num]+1]
                else:
                    return [freq_map[target - num]+1, i+1]