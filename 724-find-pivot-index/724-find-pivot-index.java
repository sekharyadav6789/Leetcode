class Solution {
    public int pivotIndex(int[] nums) {
        //1.Find the sum of the array
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        //2.Make leftside sum and right side sum
        int lsum=0;
        int rsum=sum;
        
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            
            //update
            lsum+=nums[i];
        }
        return -1;
    }
}