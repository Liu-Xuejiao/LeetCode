class Solution {
    public String countAndSay(int n) {
        String result = "1";
        
        for(int i=1; i<n; i++){
            result = countAndSay(result);
        }
        return result;
    }

    public String countAndSay(String s) {
       StringBuilder sb = new StringBuilder();
        int size = s.length();
        
        for(int i=0; i<size; ++i){
            int count = 1;
            while(i+1<size && s.charAt(i) == s.charAt(i+1)){
                ++i;
                ++count;
            }
           sb.append(count).append(s.charAt(i));
        }
        
        return sb.toString();
    }
}