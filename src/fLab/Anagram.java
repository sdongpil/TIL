package fLab;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram("dongpil", "pildong");

        System.out.println("result = " + result);
    }

    public boolean isAnagram(String s, String t) {
        String[] split1 = s.split("");
        String[] split2 = t.split("");

        Arrays.sort(split1);
        Arrays.sort(split2);

        String string1 = Arrays.toString(split1);
        String string2 = Arrays.toString(split2);

        return string1.equals(string2);
    }

}
