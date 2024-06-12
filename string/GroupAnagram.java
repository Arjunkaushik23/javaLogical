package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagram solution = new GroupAnagram();
        List<List<String>> result = solution.groupAnagram(strs);
        System.out.println(result);

    }

    private List<List<String>> groupAnagram(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!result.containsKey(sortedStr)){
                result.put(sortedStr, new ArrayList<>());
            }

            result.get(sortedStr).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
