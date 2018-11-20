package me.quydo.katas.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static List<String> anagramsOf(String str) {
        if (str == null) {
            return null;
        }

        if (str.length() <= 1) {
            return Arrays.asList(str);
        }

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++) {
            String characterAtIndex = String.valueOf(str.charAt(i));
            List<String> anagramsOfRest = anagramsOf(removeCharacterAt(str, i));
            for (String item : anagramsOfRest) {
                result.add(characterAtIndex + item);
            }
        }

        return result;
    }

    private static String removeCharacterAt(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1, str.length());
    }

}
