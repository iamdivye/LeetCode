class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        Stack<Integer> st= new Stack<>();
        for(int k : nums2){
            while(!st.isEmpty() && k>st.peek()){
                map.put(st.pop(),k);
            }
            st.push(k);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }

        int ans[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
