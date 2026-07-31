class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        soln(0,target,candidates,new ArrayList(),ans);
        return ans;
    }
    void soln(int i, int t, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j] == arr[j-1])continue;
            if(arr[j] > t)break;
            ds.add(arr[j]);
            soln(j+1,t-arr[j],arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}
