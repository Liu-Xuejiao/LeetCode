class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder result = new StringBuilder();
        
        int carry = 0;
        
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        
        while(lengthA>=0 || lengthB>=0){
            int x =0, y=0;
            if(lengthA>=0){
                x=a.charAt(lengthA)-'0';
                lengthA--;
            }
            if(lengthB>=0){
                y=b.charAt(lengthB)-'0';
                lengthB--;
            }
            
            int sum = x + y + carry;
            carry = sum / 2;
            sum = sum % 2;
            
            result.append(sum);
        }
        
        if(carry >= 1){
            result.append('1');
        }
        
        result = result.reverse();
        
        return result.toString();
        
        
    }
}
