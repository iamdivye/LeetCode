class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[]= new int[26];
        if(magazine.length()<ransomNote.length())
        return false;
        
        for(int i=0;i<magazine.length();i++){
            if(i<ransomNote.length()){
                a[ransomNote.charAt(i)-'a']--;
            }
            a[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]<0)
            return false;
        }
        return true;
    }
}
