class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        str = str.replaceAll("\\s","");
        if(str!=""){
            char[] chars1 = str.toCharArray();
            int size = chars1.length;
            char[] chars2 = new char[size];
        
            for (int i=1; i<=size; i++){
                chars2[size-i] = chars1[i-1];
            }
        
            String str1 = new String(chars1);
            String str2 = new String(chars2);
            
            if(str1.equals(str2)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
