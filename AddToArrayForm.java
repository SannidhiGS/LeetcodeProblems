// An array num representing a number (each element is a digit)
// An integer k
// You need to add k to the number represented by the array and return the result as a list of digits.

// Step-by-Step Explanation
// Key Idea

// We add digits from right to left, just like normal addition.
// i → points to last digit of num
// k → holds carry + remaining number
// % 10 → gives current digit
// / 10 → carry

class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result=new LinkedList<>();
        int i=num.length-1;
        while(i>=0||k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            result.addFirst(k%10);
            k/=10;
        }
        return result;
    }
}
