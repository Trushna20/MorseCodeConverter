import java.util.Scanner;

public class MorseCodeConverter {

    public static void main(String[] args) {

        // Arrays for alphabet and Morse codes
        char[] alphabet = {
                'A','B','C','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };

        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name (or any word): ");
        String word = sc.nextLine();

        System.out.print("Morse Code: ");

        // Convert each character to Morse code
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            // Skip spaces between words
            if (ch == ' ') {
                System.out.print("/ ");
                continue;
            }

            // Convert small letters to capital
            if (ch >= 'a' && ch <= 'z') {
                ch = Character.toUpperCase(ch);
            }

            // Find matching Morse code
            for (int j = 0; j < alphabet.length; j++) {
                if (ch == alphabet[j]) {
                    System.out.print(morse[j] + " ");
                }
            }
        }

        sc.close();
    }
}
