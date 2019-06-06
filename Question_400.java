import java.lang.Math; 

class Solution {
    public int findNthDigit(int n) {
    	
    	int[] parameters = new int[]{9,189,2889,38889,488889,5888889,68888889,788888889};
    	
        int length = 1;
        int result = 0;
        
        
        for(int i=parameters.length - 1; i>=0; i--) {
        	 if(parameters[i] < n ) {
        		
        		 length = i+2;
        		 result = parameters[i];
             	 break;
             }
        }
        
        int index = (n - result -1)/length;
        int mod = (n-result-1) % length;
        result = index + (int)Math.pow(10, (length - 1));

      
        return String.valueOf(result).charAt(mod)-'0';
        
    }
}