class Solution {
    public int numJewelsInStones(String J, String S) {

        if(S.equals("")){
            return 0;
        }
        
        char[] jewelsArray = J.toCharArray();
        int sum = 0;
        int i = 0;
        for (i=0; i<jewelsArray.length; i++){
            sum = sum + S.length() - S.replaceAll(Character.toString(jewelsArray[i]),"").length();
        }
        return sum;
    }
}
