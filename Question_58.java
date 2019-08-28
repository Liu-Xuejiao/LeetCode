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

//Solution #2
//class Solution {
//    public int lengthOfLastWord(String s) {
//        int lastLen = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ' && lastLen > 0) {
//                return lastLen;
//            } else if (s.charAt(i) != ' ') {
//                lastLen++;
//            }
//        }
//        return lastLen;
//    }
//}


//Solution #3
//class Solution {
//	public int lengthOfLastWord(String s) {
//	    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
//	}
//}

