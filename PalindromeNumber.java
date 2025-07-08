class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else if(x==pallen(x))
        return true;
        else 
        return false;
    }
    public int pallen(int x){
        int rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
}
