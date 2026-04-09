// Problem Idea (Simple Words)

// You start with full bottles

// After drinking, each bottle becomes empty

// You can exchange numExchange empty bottles → 1 full bottle

// That new full bottle can again be drunk → gives another empty

// Continue until you don’t have enough empty bottles
class WaterBottels {
    public int numWaterBottles(int numBottles, int numExchange) {
       int iDrink = numBottles;

       while (numBottles >= numExchange) {
           int newBottles = numBottles / numExchange;
           int remBottles = numBottles % numExchange;

           iDrink = iDrink + newBottles;
           numBottles = newBottles + remBottles;
       }
       return iDrink;
    }
}
