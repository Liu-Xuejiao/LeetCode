import java.util.ArrayList;

class Solution {
    public String getPermutation(int n, int k) {
    	String result = "";
    	ArrayList<Integer> num = new ArrayList<Integer>();
    	
    	for(int i = 1; i<= n; i++) {
    		num.add(i);
    	}
    	
        return getNum(num,k);
    }
    
    public String getNum(ArrayList<Integer> num, int k) {
    	String resultnum = "";
    	int size = num.size();
        int currentindex = 0, diff = 0;
        int sum = factorial(size-1);
        
    	if(num.isEmpty()) {
    		return resultnum;
    	}else {
            if(k > factorial(size-1)){
                currentindex = k / sum;
                diff = k - currentindex * sum;
                System.out.println("diff: " + diff);
                if( diff == 0) {
            		currentindex --;
            	}
                
                k -= sum * currentindex;  
            }else {
            	currentindex = 0;
            }
            
            int current = num.get(currentindex);
    		num.remove(currentindex);

            
    		resultnum = current + getNum(num,k);
    	}
    	
    	return resultnum;
    }
                  
    public static int factorial(int number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

}