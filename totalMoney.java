class Solution {
    public int totalMoney(int n) {
       int weeks = n / 7;     
        int restDays = n % 7;   
        int total = 0;
        total += 7 * weeks * (weeks + 1) / 2;  
        total += 21 * weeks;             
        for (int i = 1; i <= restDays; ++i) {
            total += weeks + i;
        }
        return total;
    }
}
