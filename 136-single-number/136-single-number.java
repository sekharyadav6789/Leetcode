class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        
        //Traverse over the array
        for(int i=0;i<nums.length;i++){
            //if number is present in map
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            //if number is not present in map
            else{
                map.put(nums[i],1);
            }
        }
        
        //Traverse over the map.
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }
        return -1;
    }
}