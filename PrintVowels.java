public class PrintVowels {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.print("Vowels: ");

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
