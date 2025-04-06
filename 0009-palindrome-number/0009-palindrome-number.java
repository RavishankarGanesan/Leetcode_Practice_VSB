class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x;
        int digit = 0;
        int rev = 0;
        while (temp != 0) {
            digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;

        }
    //return rev  == x;
    if(rev ==x){
        return true;
    }
    else{
        return false;
    }
    }
}