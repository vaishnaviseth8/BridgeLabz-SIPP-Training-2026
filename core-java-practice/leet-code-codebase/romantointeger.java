class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int v=valueOf(s.charAt(i));
            if(i<s.length()-1){
                int n=valueOf(s.charAt(i+1));
                if(v<n){
                ans=ans-v;
                }
                else{
                    ans=ans+v;
                }
            }
            else{
                ans=ans+v;
            }
        }
        return ans;
    }

    public int valueOf(char c){
        switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
        }
    }
}