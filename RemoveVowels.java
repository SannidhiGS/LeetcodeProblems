public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lower = Character.toLowerCase(ch);

            if (lower != 'a' && lower != 'e' && lower != 'i' &&
                lower != 'o' && lower != 'u') {
                result += ch;
            }
        }

        System.out.println("After removing vowels: " + result);
    }
}
