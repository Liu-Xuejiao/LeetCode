class Solution {
    public String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuilder();
        int i=0;
        int len = s.length();
        while(i<len){
            for(int index=0; index<nRows && i<len; index++){
                sb[index].append(c[i]);
                System.out.println(i+":"+c[i]);
                i++;
            }
            for(int index=nRows-2; index>0 && i<len; index--){
                sb[index].append(c[i]);
                System.out.println(i+":"+c[i]);
                i++;
            }
        }
        
        for(int j=1; j<nRows; j++){
            sb[0] = sb[0].append(sb[j]);
        }
        
        return sb[0].toString();
        
    }
}
