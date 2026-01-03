//Powers of two are always positive

//0 and negative numbers can never be powers of two
// A number is a power of two if it can be written as:

// 2^0 = 1
// 2^1 = 2
// 2^2 = 4
// 2^3 = 8
// 2^4 = 16
// ...
//The soloution of the code

class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        //if value of n is negative number then condition will became false
        if(n<1){
            return false;
        }
        //if the value of n equal to 1 then contiotion true
        else if(n==1){
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }
            else{
                return false;
            }
        }
        
     }
}
