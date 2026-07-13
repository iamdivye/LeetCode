class Solution {
    public int longestPalindrome(String s) {
        int []a= new int[52];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            a[s.charAt(i)-'a']++;
            else
            a[26+s.charAt(i)-'A']++;

        }
        int tot=0,k=0;
        for(int i=0;i<52;i++){
            if(a[i]%2==0){
                tot+=a[i];
            }else if(a[i]>2){
                tot+=a[i]-1;
                k++;
            }else{
                k+=a[i];
            }
        }
        if(k>0)
        return tot+1;
        else return tot;
    }
}
