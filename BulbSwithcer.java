//  Problem Recap (Bulb Switcher)

// There are n bulbs, all initially OFF

// You do n rounds

// In round i, you toggle (ON ↔ OFF) every i-th bulb

// After all rounds, return how many bulbs are ON

// Key Observation (Very Important)

// A bulb is toggled:

// once for every divisor it has

// Example: Bulb 6

// Divisors of 6 → 1, 2, 3, 6 (4 divisors → even)
//  Ends OFF

// Example: Bulb 9

// Divisors of 9 → 1, 3, 9 (3 divisors → odd)
// Ends ON

class  BulbSwithcer{
    public int bulbSwitch(int n) {
         int count=0;
         int i=1;

         while(i*i<=n){
            count++;
            i++;
         }
         return count;
    }
}
