class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = reverse(x,0);
        if(rev==x){
            return true;
        }
        return false;
    }
    static int reverse(int n,int z){
        if(n==0){
            return z;
        }
        z = (z * 10) + (n % 10);
        return reverse(n/10,z);
    }
}