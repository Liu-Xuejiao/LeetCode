class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int last = 0;
        int[] store = new int[len];
        store[0] = 1;
        for (int i = 1; i < len; i++) {
            store[i] = 1;
            char c = s.charAt(i);
            for (int j = i - 1; j >= last; j--) {
                if (s.charAt(j) != c) {
                    store[j]++;
                } else {
                    last = j;
                    break;
                }
            }
        }
        // find max
        int result = 1;
        for (int i : store) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
