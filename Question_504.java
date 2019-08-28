import java.lang.StringBuilder;

class Solution {
    public String convertToBase7(int num) {
        StringBuilder result = new StringBuilder(); 
        boolean isNeg = false;
        if(num==0){
            return "0";
        }else if(num<0){
            isNeg = true;
            num = 0-num;
        }
        
        while(num >0 ){
            result.append(num%7);
            num = num /7;
        }
        
        return (isNeg?"-":"")+result.reverse();
        
    }
}
