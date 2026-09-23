class Solution:

    def encode(self, strs: List[str]) -> str:
        if strs == []:
            return "ñ"
        result = "é".join(strs)
        return result

    def decode(self, s: str) -> List[str]:
        if s == "ñ":
            return []
        return s.split("é")