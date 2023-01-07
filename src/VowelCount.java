import java.util.Scanner;

public class VowelCount {

    public void countVowels() {

        Scanner sc = new Scanner(System.in);
        int vowelCount = 0;
        String[] vowelsList = {"a", "e", "i", "o", "u"};
        String userSentence = sc.nextLine();
        String lowerCase = userSentence.toLowerCase();

        for (int i = 0; i < userSentence.length(); i++) {
            if (lowerCase.contains(vowelsList[i])) {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}