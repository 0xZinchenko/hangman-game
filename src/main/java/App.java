import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String word = "pizza";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }



        scanner.close();
    }
}
