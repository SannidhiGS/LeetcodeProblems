public class CheckVowel {
    public static void main(String[] args) {
        char ch = 'A';
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is not a vowel");
        }
    }
}
