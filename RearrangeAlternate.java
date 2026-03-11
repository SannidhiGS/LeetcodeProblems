import java.util.ArrayList;

public class RearrangeAlternate {
    public static void main(String[] args) {

        int[] arr = {5, -3, 8, -2, -7, 4, 1};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Step 1: Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Step 2: Rearrange alternately
        int i = 0, p = 0, n = 0;

        while (p < positive.size() && n < negative.size()) {
            arr[i++] = positive.get(p++);
            arr[i++] = negative.get(n++);
        }

        // Step 3: Add remaining elements (if any)
        while (p < positive.size()) {
            arr[i++] = positive.get(p++);
        }

        while (n < negative.size()) {
            arr[i++] = negative.get(n++);
        }

        // Print result
        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
