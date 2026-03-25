class Solution {
    public static String customSortString(String order, String s) {
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (char c : order.toCharArray()) {
            while (freq[c - 'a'] > 0) {
                result.append(c);
                freq[c - 'a']--;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                result.append((char)(i + 'a'));
                freq[i]--;
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String order = sc.next();
        String s = sc.next();
        
        System.out.println(customSortString(order, s));
        
        sc.close();
    }
}
