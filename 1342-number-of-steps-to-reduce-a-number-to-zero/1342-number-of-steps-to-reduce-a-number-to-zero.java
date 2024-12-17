class Solution {
    public int numberOfSteps(int num) {
        return reduce(num,0);
    }
    static int reduce(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return reduce(n/2,c+1);
        }
        else{
            return reduce(n-1,c+1);
        }
    }
}