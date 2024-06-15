import java.util.*;

public class Anagram {
    List<String> anagram = new ArrayList<>();
    List<List<String>> anagramsList = new ArrayList<>();
    int count = 0;

    public List<List<String>> groupAnagrams(String[] strs) {


        // 배열의 요소들을 리스트에 저장
        for (int i = 0; i < strs.length; i++) {
            String string = strs[i];
            for (int j = 0; j < string.length(); j++) {

                // 문자열 끼리 비교하여 동일한 char을 모두 포함하는지 검증 필요
                for (int k = 0; k < string.length(); k++) {
                    char index = string.charAt(k);
                    String valid = String.valueOf(index);
                    if (string.contains(valid)) {
                        count++;
                    }
                }
            }

            // 아나그램으로 분류된 문자열을 리스트에 저장
            if (count == string.length()) {
                anagram.add(string);
            }
            // 아나그램을 아나그램 리스트에 저장
            anagramsList.add(anagram);
        }

        // 아나그램 리스트를 오름차순으로 정렬하여 return
        return anagramsList;
    }

    // 문자열 끼리 비교하여 동일한 char을 모두 포함하는지 검증 필요

    /**
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * @param string
     */
    private void compareString(String string) {
        for (int i = 0; i < string.length(); i++) {
            StringTokenizer token = new StringTokenizer(string);
            String validAnagram = token.toString();

            if (string.contains(validAnagram)) {
                count++;
            }
        }

    }
}
