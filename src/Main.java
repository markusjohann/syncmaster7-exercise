import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vowelCount = 0;
        String[] vowelsList = {"a", "e", "i", "o", "u"};

        System.out.println("Insert word or a sentence:");
        String userWord = sc.nextLine();

        // To simplify things, change userWord to loweCase.
        String lowerCase = userWord.toLowerCase();
        System.out.println(lowerCase);

        for (int i = 0; i < userWord.length(); i++) {
            if (lowerCase.contains(vowelsList[i])) {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);


    }
}