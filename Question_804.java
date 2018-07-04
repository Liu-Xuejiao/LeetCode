class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            
        Set<String> result = new HashSet<String>();
        
        for(String word : words){
            String moreseCode = "";
            for(char l: word.toCharArray()){
                moreseCode += morse[(int)l-97];
               
            }
            result.add(moreseCode);
        }
        return result.size();
    }
}
