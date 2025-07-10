class Solution {
    public int reverse(int x) {
        int result = 0;
        String s=String.valueOf(Math.abs(x));
        StringBuilder sb=new StringBuilder(s).reverse();
        try{
            result=Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            return 0;
        }
        if(x<0)
        return -result;
        else
        return result;
    }
}
