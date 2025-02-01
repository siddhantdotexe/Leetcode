class Solution {
    public boolean isHappy(int n) {
        int slow=valueof(n);
        int fast=valueof(valueof(n));
         while (fast != slow) {
            if (fast == 1 || slow == 1) {
                return true;
            }
            fast = valueof(valueof(fast)); 
            slow = valueof(slow);

    }
            return fast == 1;
    }
    static int valueof(int number){
        int sq=0;
        while (number > 0) {
            int digit = number % 10;
            sq+=digit*digit;
            number /= 10;
        }
        return sq;
    }
}