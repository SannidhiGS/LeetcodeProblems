import java.util.ArrayList;

public class SeparateNumbers {
    public static void main(String[] args) {

        int[] arr = {5, -3, 8, -2, 0, -7, 4};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
    }
}
