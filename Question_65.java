import java.util.regex.Pattern;

class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
       
        if(s.equals("")) return false;
        if(!s.matches(".*\\d.*")) return false;
        
        String pattern = "^[+|-]?\\d*(\\.\\d*)?(d+e-?\\d+)?";
        
        Pattern r = Pattern.compile(pattern);
        
//        return r.matches(pattern, s);
        return s.matches("\\s*([+-]?(\\d+\\.?\\d*|\\.\\d+)(e[+-]?\\d+)?|0x[\\da-fA-F]+)\\s*");
    }
}

