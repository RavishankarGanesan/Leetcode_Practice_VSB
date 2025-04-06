class Solution {
    public int reverse(int x) {
        int digit =0;
        long rev=0;
        
        while(x!=0){
            digit =x%10;
            rev =(rev*10)+digit;
         x /=10;
        }
        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)? 0 :(int)rev;
    }
}