class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
       //faith
        boolean rr=isPowerOfFour(n/4);
        if(rr==false || n%4!=0){
            return false;
        }
        return true;
    }
}