import string
class Solution:
    def isPalindrome(self, s: str) -> bool:
        allowed = set(string.ascii_letters + string.digits)
        table = {ord(c): None for c in map(chr, range(256)) if c not in allowed}
        cleaned = s.translate(table).lower()
        return cleaned == cleaned[::-1]