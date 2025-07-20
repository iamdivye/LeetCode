class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) - 1);
                if (frequency.get(c) == 0) {
                    frequency.remove(c);
                }
            } else {
                return c;
            }
        }
        for (char c : frequency.keySet()) {
            if (frequency.get(c) != 0) {
                return c;
            }
        }
        return ' ';
    }
}
