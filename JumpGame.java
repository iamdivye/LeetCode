class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
             if (i > max)
                return false;
            if(i+nums[i]>max)
            max=i+nums[i];
            if(max>=nums.length-1)return true;
            if(max<i+1)break;
        }
        if(max<nums.length-1)
        return false;
        else 
        return true;
    }
}
