class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replace(" ", "");
        String cleanedStr = result.replaceAll("[^a-z0-9]", "");
        int start=0;
        int end= cleanedStr.length()-1;
        return check(start,end,cleanedStr);
    }
    static boolean check(int start,int end,String s){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)==s.charAt(end)){
            return check(start+1,end-1,s);
        }
        return false;
    }
}