class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] boolArr = new boolean[26];
        for (char c : allowed.toCharArray()) {
            boolArr[c - 'a'] = true;
        }
        int out = 0;
        for (String word : words) {
            if (checkConsistent(word, boolArr)) {
                out++;
            }
        }
        return out;
    }

    private boolean checkConsistent(String word, boolean[] boolArr) {
        for (int i = 0; i < word.length(); ++i) {
            if (!boolArr[word.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}
