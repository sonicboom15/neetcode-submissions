class Solution {
    public boolean isAnagram(String s, String t) {
		Map<Character, Integer> freqMapS = s.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(
               c -> c,
               c -> 1,
               Integer::sum
        ));
		Map<Character, Integer> freqMapT = t.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(
               c -> c,
               c -> 1,
               Integer::sum
        ));
		return freqMapS.equals(freqMapT);
    }
}
