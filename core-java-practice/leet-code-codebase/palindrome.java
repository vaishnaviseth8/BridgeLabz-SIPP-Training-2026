class Solution {
    public boolean isPalindrome(int x) {
        int z = x;
        int y = 0;

        while(x > 0){
            int a = x % 10;
            y = y * 10 + a;
            x = x / 10;
        }

        if(z == y){
            return true;
        }

        return false;
    }
}