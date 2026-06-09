class Solution {
    public int reverse(int x) {
        int a=0;
        int temp=Math.abs(x);
        while(temp>0){
            int b=temp%10;
            if(a>Integer.MAX_VALUE/10) return 0;
            a=a*10+b;
            temp=temp/10;
        }        
        if(x <0){
            return a*-1;
        }
        else{
            return a;
        }
    }
}