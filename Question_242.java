class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        
        final int num = 26;
        int[] result = new int[num];
        
        for(int i=0; i<s.length(); i++){
            result[s.charAt(i)-'a']++;
            result[t.charAt(i)-'a']--;
        }
        
        for(int i=0; i<num; i++){
            if(result[i]!=0)
                return false;
        }
        return true;
    }
}
