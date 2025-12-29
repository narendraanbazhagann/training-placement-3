class Solution {
    public int countWords(String[] w1, String[] w2) {
        Map<String, Integer> map = new HashMap<>();

        for (String w : w1)
            map.put(w, map.getOrDefault(w, 0) + 1);

        for (String w : w2)
            map.put(w, map.getOrDefault(w, 0) + 10);

        int count = 0;
        for (int val : map.values()) {
            if (val == 11) count++; 
        }
        return count;
    }
}
