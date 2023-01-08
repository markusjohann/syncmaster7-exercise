import java.util.Scanner;

public class VowelCount {

    public void countVowels() {

        Scanner sc = new Scanner(System.in);
        int vowelCount = 0;
//        String[] vowelsList = {"a", "e", "i", "o", "u"};
//        char[] vowelsList = {'a', 'e', 'i', 'o', 'u'};
        String userSentence = sc.nextLine();
        String lowerCase = userSentence.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {

          if(lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i' ||
             lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u') {
             vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}