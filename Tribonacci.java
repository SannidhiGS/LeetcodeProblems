// Tribonacci is similar to Fibonacci, but:

// T(n) = T(n−1) + T(n−2) + T(n−3)


// Base cases:

// T(0) = 0
// T(1) = 1
// T(2) = 1


// Sequence:

// 0, 1, 1, 2, 4, 7, 13, 24, ...

class Tribonacci{
    public int tribonacci(int n) {
       if(n==0){
        return 0;
       }
        if(n==1||n==2){
            return 1;
        }

        int firstNum=0;
        int secNum=1;
        int thirdNum=1;

        for(int i=1;i<=n;i++){
            int fourthNum=firstNum+secNum+thirdNum;
            firstNum=secNum;
            secNum=thirdNum;
            thirdNum=fourthNum;
        }
        return firstNum;
    }
}
// for(int i = 1; i <= n; i++){
// This loop:

// Runs too many times

// Makes reasoning harder

// Forces you to return firstNum, which is confusing

// Just like Fibonacci, we already know T(0), T(1), T(2), so we should start calculating from T(3).
// Another Solution

class Solution {
    public int tribonacci(int n) {
       if(n==0){
        return 0;
       }
        if(n==1||n==2){
            return 1;
        }

        int firstNum=0;
        int secNum=1;
        int thirdNum=1;

        for(int i=3;i<=n;i++){
            int fourthNum=firstNum+secNum+thirdNum;
            firstNum=secNum;
            secNum=thirdNum;
            thirdNum=fourthNum;
        }
        return thirdNum;
    }
}
//This is the good one which one u want


