class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Approach 1
        int []ans=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
    return ans;
        
        // //Approach 2
        // Map<Integer,Integer>mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.contaiskey()!=i)
        // }
    }
}