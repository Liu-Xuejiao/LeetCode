class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty()) {
            return true;
        }

        s = s.replaceAll("\\s|[\\W&&\\D]","");
        
        System.out.println(s);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
