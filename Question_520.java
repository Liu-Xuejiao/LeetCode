class Solution {
    public boolean detectCapitalUse(String word) {
        boolean result = false;
        boolean otherupper = false;
        boolean otherlower = false;
        
        char[] wordChar = word.toCharArray();
        if(wordChar.length == 1){
            return true;
        }
        
        for(int i=1; i<wordChar.length; i++){
            if(Character.isUpperCase(wordChar[i])){
                otherupper = true;
            }else{
                otherlower = true;
            }
        }
        
        if(Character.isUpperCase(wordChar[0])){
            return !(otherupper & otherlower);
        }else{
            return !otherupper;
        }
        
       
    }
}
