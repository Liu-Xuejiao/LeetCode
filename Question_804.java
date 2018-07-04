class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            
        Set<String> result = new HashSet<String>();
        
        for(String word : words){
            String moreseCode = "";
            for(char l: word.toCharArray()){
                int temp = (int)l;
                moreseCode = moreseCode + morse[temp-97];
               
            }
            result.add(moreseCode);
        }
        return result.size();
    }
}
