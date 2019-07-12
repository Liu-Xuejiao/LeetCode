class Solution {
    public int lengthOfLastWord(String s) {
       if(s.equals("")){
           return 0;
       }
           
        String[] words = s.split(" ");
        int size = words.length;
        if (size ==0 ){
            return 0;
        }
            return words[size-1].length();
       
    }
}