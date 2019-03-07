class Solution {
     String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    
    public int romanToInt(String s) {
        int result = 0;
        
        char romanChar[] = s.toCharArray();
        int size = romanChar.length;
        
        for (int i=0; i<size; i++){
            if (i==size-1){
                result = result + indexofarray(romanChar[i]+"");
                continue;
            }
            if(indexofarray(romanChar[i]+"")<indexofarray(romanChar[i+1]+"")){
                result = result - indexofarray(romanChar[i]+"");
            }else{
                result = result + indexofarray(romanChar[i]+"");
            }
        }
        return result;
    }
    
    public int indexofarray(String s){
        
        return values[java.util.Arrays.asList(romans).indexOf(s)];
    }
}
