class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        boolean rr=isPowerOfTwo(n/2);
        if(rr==false || n%2!=0){
            return false;
        }
        return true;
    }
}