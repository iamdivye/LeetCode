class Solution {
    public int titleToNumber(String columnTitle) {
        int num=0,x=columnTitle.length()-1;
        for(int i=0;i<columnTitle.length();i++){
            num+=(columnTitle.charAt(i)-64)*(Math.pow(26,x));
            x--;
        }
        return num;
    }
}
