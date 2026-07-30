class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        rec(0,candidates,target,new ArrayList<Integer>(),ans);
        return ans;
    }
    void rec(int i,int[] arr, int t,ArrayList<Integer> ds,List<List<Integer>> ans){
        if(i==arr.length){
            if(t==0)
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(arr[i] <= t){
            ds.add(arr[i]);
            rec(i,arr,t-arr[i],ds,ans);
            ds.remove(ds.size()-1);
        }
        rec(i+1,arr,t,ds,ans);
    }
}
