package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    public static List<List<String>> anagram(){

        String[] s = {""};

        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

         if (s ==  null || s.length == 0) {
            return result;
         } else {
            for (String str : s) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sortedString = new String(chars);
                if (map.containsKey(sortedString) == false) {
                    map.put(sortedString, new ArrayList<>());
                }
                map.get(sortedString).add(str);
            }
    
            result.addAll(map.values());
        
            return result;

         }

    }
    public static void main(String[] args) {
        List<List<String>> isGroupAnagram = anagram();
        System.out.println(isGroupAnagram);
    }
}
