package basicprogramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"apple", "appl", "applitude"};
        String longestPrefix = longestPrefixFinder(input);
        System.out.println(longestPrefix);
    }

    public static String longestPrefixFinder(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }

        List<String> list = new ArrayList<>(Arrays.asList(strs));

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < list.get(0).length(); i++) {
            char currentChar = list.get(0).charAt(i);
            boolean isCommon = true;

            for (int j = 1; j <list.size(); j++) {
                if (i >= list.get(j).length() || list.get(j).charAt(i) != currentChar) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                commonPrefix.append(currentChar);
            }else{
                break;
            }

        }
        return commonPrefix.toString();
    }
}
