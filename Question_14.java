class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        int index = 0;
        String record ="";
        try {
        while(true){
            char previousC = strs[0].charAt(index);
            char curChar = previousC;
            for(String s : strs){
                curChar = s.charAt(index);
                if (previousC == curChar){
                    previousC = curChar;
                } else{
                    return record;
                }
            }
            record += curChar;
             index ++;
        }
    
    } catch (Exception e){
        
    }finally{
        return record;
    }
    }
}
