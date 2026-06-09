class Solution {
    public int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
        if(num%2==0){
            num=num/2;
        }
        else{
            num=num-1;

        }
        return numberOfSteps(num)+1;
        
    }
}