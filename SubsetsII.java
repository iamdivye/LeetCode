class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    void fun(int idx, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i-1] == arr[i])continue;
            ds.add(arr[i]);
            fun(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}
