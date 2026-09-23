class Solution {
    public boolean isAnagram(String s, String t) {

		HashMap<String, Integer> sDict = new HashMap<>();
		
		Arrays.asList(s.split("")).stream().forEach(c -> {
			if (sDict.containsKey(c)) {
				sDict.put(c, sDict.get(c) + 1);
			} else {
				sDict.put(c, 1);
			}
		});

		HashMap<String, Integer> tDict = new HashMap<>();
		Arrays.asList(t.split("")).stream().forEach(c -> {
			if (tDict.containsKey(c)) {
				tDict.put(c, tDict.get(c) + 1);
			} else {
				tDict.put(c, 1);
			}
		});

		if(sDict.size() != tDict.size()){
			return false;
		}
		if(sDict.size() > 0){
			sDict.forEach((key, value) -> {
				if(tDict.containsKey(key) && tDict.get(key).equals(value)){
					tDict.remove(key);
				}
			});
		}
        if(tDict.size()==0) {
			return true;
		}
        return false;
    }
}
