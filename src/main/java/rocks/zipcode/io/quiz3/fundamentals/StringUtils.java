package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] newArr = str.toCharArray();
        newArr[indexToCapitalize] = Character.toUpperCase((newArr[indexToCapitalize]));
        return new String(newArr);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++) {
            if(baseString.toCharArray()[indexOfString] == characterToCheckFor) {
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        int count = string.length() * (string.length() + 1) / 2;
        Set<String> sub = new HashSet<>(count);
        for(int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j<= string.length(); j++) {
                sub.add(string.substring(i, j));
            }
        }
        return sub.toArray(new String[sub.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        int count = input.length() * (input.length() + 1) / 2;
        int sub = -1;
        ArrayList<String> substrings = new ArrayList<>(count);

        for (int i = 0; i< input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                substrings.add(input.substring(i, j));
                sub++;
            }
        }
        return sub;
    }
}
