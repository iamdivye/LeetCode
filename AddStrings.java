class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        int carry=0;
        StringBuilder sb= new StringBuilder("");
        while(i >= 0 || j >= 0 || carry != 0){
            int a,b;
            if(i>=0)
            a=num1.charAt(i)-'0';
            else
            a=0;
            if(j>=0)
            b=num2.charAt(j)-'0';
            else
            b=0;
            int sum=(a+b+carry)%10;
            sb.append(sum);
            carry=(a+b+carry)/10;
            i--;j--;
        }
        return sb.reverse().toString();
    }
}
