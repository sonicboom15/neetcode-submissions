from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False
        _s = Counter(s)
        _t = Counter(t)
        return _s == _t
