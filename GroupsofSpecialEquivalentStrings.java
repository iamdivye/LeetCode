class Solution {
    public static int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        
        for (String word : words) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    even.append(word.charAt(i));
                } else {
                    odd.append(word.charAt(i));
                }
            }
            
            char[] evenArr = even.toString().toCharArray();
            char[] oddArr = odd.toString().toCharArray();
            
            Arrays.sort(evenArr);
            Arrays.sort(oddArr);
            
            String key = new String(evenArr) + "|" + new String(oddArr);
            set.add(key);
        }
        
        return set.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        System.out.println(numSpecialEquivGroups(words1)); 

        String[] words2 = {"abc","acb","bac","bca","cab","cba"};
        System.out.println(numSpecialEquivGroups(words2)); 
    }
}
