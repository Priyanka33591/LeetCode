public class LeetCode1518 {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;

        while(numBottles >= numExchange){
            int rem = numBottles % numExchange;
            int bottlesDrink = (numBottles / numExchange);
            count =  count + bottlesDrink;
            numBottles = bottlesDrink + rem;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(numWaterBottles(9,10));

    }
}
