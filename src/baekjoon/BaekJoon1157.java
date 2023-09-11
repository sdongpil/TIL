package baekjoon;

import java.util.Scanner;

public class BaekJoon1157 {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                alphabetCount[index]++;
            }
        }
        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                result = (char) (i + 'A');
            } else if (alphabetCount[i] == maxCount) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}


