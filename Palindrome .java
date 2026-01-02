class Solution {
    public boolean isPalindrome(int x) {
        //for negative number
        if(x<0){
            return false;
        }
        //assign value of x to n
        int n=x;
        int revNum=0;
        while(n>0){
            int d=n%10;
            revNum=revNum*10+d;
            n=n/10;
        }
        if(revNum==x){
            return true;
        }
        else{
            return false;
        }
    }
}
