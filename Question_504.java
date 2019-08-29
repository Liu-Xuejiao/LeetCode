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

//Solution #2:
//public String convertToBase7(int n) {
//    if (n < 0) return "-" + convertToBase7(-n);
//    if (n < 7) return Integer.toString(n);
//    return convertToBase7(n / 7) + Integer.toString(n % 7);
//}