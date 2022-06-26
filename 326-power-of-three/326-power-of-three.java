class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        boolean rr=isPowerOfThree(n/3);
        if(rr==false || n%3!=0){
            return false;
        }
        return true;
    }
}