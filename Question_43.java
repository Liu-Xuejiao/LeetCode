class Solution {
    public String multiply(String num1, String num2) {
        
        int l1 = num1.length();
        int l2 = num2.length();
        
        int result2D [][] = new int[l1][l2+l1-1];
        int result1D [] = new int[l1+l2-1];
        
        int current=0, carry=0;
        
        StringBuilder str = new StringBuilder();
        
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        
        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                result2D[i][j+i] = mul;
            }
        }
        
        for(int j=0; j<l2+l1-1; j++){
            for(int i=0; i<l1; i++){
                result1D[j] += result2D[i][j];
            }
        }
        
        for(int j=l2+l1-1; j>0; j--){
            current = result1D[j-1] + carry;
            if(current >=10){
                carry = current / 10;
                current = current % 10;
            }else{
                carry = 0;
            }
            str.append(current);
        }
        
        if(carry != 0){
            str.append(carry);
        }
        
        str = str.reverse();
        
        return str.toString();
    }
}
