class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        if(haystack.equals(""))
            return -1;
       
        
        int length1 = haystack.length();
        int length2 = needle.length();
        int result = -1;
        
        for(int i=0 ; i<length1-length2+1; i++){
            int j=0;
            for(; j<length2; j++){
                
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j==length2)
            return i;
        }
        
        return result;
    }
}
