public class CountWordsStartingWithVowel {
    public static void main(String[] args) {
        String str = "apple is orange";
        int count = 0;

        String[] words = str.trim().split("\\s+");

        for (String word : words) {
            char firstChar = Character.toLowerCase(word.charAt(0));

            if (firstChar == 'a' || firstChar == 'e' ||
                firstChar == 'i' || firstChar == 'o' ||
                firstChar == 'u') {
                count++;
            }
        }

        System.out.println("Words starting with vowel: " + count);
    }
}
