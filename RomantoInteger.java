import java.util.*;
class Solution {
    public int romanToInt(String s) {
        
        char[] a= s.toCharArray();
        int sum=0;
        for(int i=0;i<a.length;i++){
            int val=0;
            if(a[i]=='I')val=1;
            else if(a[i]=='V')val=5;
            else if(a[i]=='X')val=10;
            else if(a[i]=='L')val=50;
            else if(a[i]=='C')val=100;
            else if(a[i]=='D')val=500;
            else if(a[i]=='M')val=1000;
            if(i+1<a.length){
                if(a[i]=='I' && a[i+1] == 'V'){
                    val=4;i+=1;
                }else if(a[i]=='I' && a[i+1] == 'X'){
                    val=9;i+=1;
                }else if(a[i]=='X' && a[i+1] == 'L'){
                    val=40;i+=1;
                }else if(a[i]=='X' && a[i+1] == 'C'){
                    val=90;i+=1;
                }else if(a[i]=='C' && a[i+1] == 'D'){
                    val=400;i+=1;
                }else if(a[i]=='C' && a[i+1] == 'M'){
                    val=900;i+=1;
                }
            }
                
            sum+=val;
        }
    return sum;
    }
}
