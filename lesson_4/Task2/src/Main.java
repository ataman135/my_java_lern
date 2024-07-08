import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String input = new Scanner(System.in).nextLine();
      System.out.print(getWords(input));
    }

    //todo метод
    public static String getWords(String input) {
        input = input.replaceAll("[.,]", "");
        input = input.replaceAll(" ", "\n");
        return input;
    }

}