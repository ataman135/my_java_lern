
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
    public static String isPalindrome(String text) {
        String newtext = text.toLowerCase().replace("[^a-zA-Z0-9]", "");
    }
}