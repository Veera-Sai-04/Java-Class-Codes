import java.util.*;

public class VowelsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Enter a character: ");
        String input = sc.nextLine();
        if (input.length() != 1) {
            System.out.println("Please enter only one character.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            boolean isVowel = false;
            for (char v : vowels) {
                if (ch == v) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is not a vowel.");
            }
        }
        sc.close();
    }
}
