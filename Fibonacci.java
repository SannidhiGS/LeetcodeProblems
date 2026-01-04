// The Fibonacci series is a sequence of numbers where each number is the sum of the two previous numbers.
// Formula:Fibonacci(n) = Fibonacci(n−1) + Fibonacci(n−2)

// Fibonacci Series Example

// The first few Fibonacci numbers are:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
// “The Fibonacci series is a sequence where each number is the sum of the previous two numbers, starting from 0 and 1.”

//   Code Snippet:

class Fibonacci{
    public int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int firstNumber=0;
        int secondNumber=1;

        for(int i=1;i<=n;i++){
           int thirdNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
        }

        return firstNumber;
    }
}
