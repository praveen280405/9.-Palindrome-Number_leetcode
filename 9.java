class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int rev = 0;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10 +rem;
            temp/=10;
        }
        if(rev == x && x>=0){
            return true;
        }else{
            return false;
        }
    }
}
