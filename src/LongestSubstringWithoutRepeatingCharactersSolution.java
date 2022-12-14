public class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() < 2) {
            return s.length();
        }

        int maxLen = 1;
        StringBuilder temp = new StringBuilder().append(s.charAt(0));
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            String t = String.valueOf(chars[i]);
            String string = temp.toString();
            temp.append(t);
            if (string.contains(t)) {
                string = temp.substring(string.indexOf(t) + 1);
                temp = new StringBuilder(string);
            } else {
                maxLen = Math.max(maxLen, temp.toString().length());
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String test = "abcabcbb";
        LongestSubstringWithoutRepeatingCharactersSolution ls = new LongestSubstringWithoutRepeatingCharactersSolution();
        ls.lengthOfLongestSubstring(test);
        System.out.println(ls.lengthOfLongestSubstring(test));
    }
}
