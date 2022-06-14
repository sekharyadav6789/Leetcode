class Solution {
    public void reverse(int []nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        
        if(k>nums.length){
            k=k%nums.length;
        }
        //reverse the array from i=0 to i=arr.length
        reverse(nums,0,nums.length-1);
        
        //reverse the array from i=0 to i=k-1
        reverse(nums,0,k-1);
        
        //reverse the array from i=k to i=arr.length-1
        reverse(nums,k,nums.length-1);
    }
}