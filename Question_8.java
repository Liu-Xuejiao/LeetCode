class Solution {
    public int myAtoi(String str) {
        int num = 0;
        String intStr = "";
        boolean postive = true;

        String [] array = str.split(" ");
        
        for(int i=0; i<array.length; i++){
            if(!array[i].isEmpty()){
                str = array[i];
                break;
            }
        }
        
        String nonSpace = str.replaceAll("\\s","");
        
        if (nonSpace == null || nonSpace.isEmpty()){
            return num;
        }
        
        if(nonSpace.charAt(0) == '-'){
            postive = false;
            nonSpace = nonSpace.substring(1);
        } else if (nonSpace.charAt(0) == '+'){
            nonSpace = nonSpace.substring(1);
        } 
        
        if (nonSpace != null && !nonSpace.isEmpty()){
            
            
            if (!(nonSpace.charAt(0) >= '0' && nonSpace.charAt(0) <= '9')){
                return num;
            }

            for (char c: nonSpace.toCharArray()){
                if (Character.isDigit(c)){
                    intStr += c;
                }else {
                    break;
                }
            } 

            if(!postive){
                try { 
                    num = Integer.parseInt(intStr);
                    num = 0-num;
                } catch(NumberFormatException e) { 
                    return Integer.MIN_VALUE; 
                }
            }else {
                try { 
                    num = Integer.parseInt(intStr);
                } catch(NumberFormatException e) { 
                    return Integer.MAX_VALUE; 
                }
            }
        }
        return num;
    }
}
