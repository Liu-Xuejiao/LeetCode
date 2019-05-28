class Solution {
    public int countPrimes(int n) {
        int count = 1;
        if(n <= 2){
            return count - 1;
        }
        for(int num=3; num<n; num+=2){
            if(isPrimes(num)){
                count++;
            }
        }
        return count;
        
    }
    
    public boolean isPrimes(int num){
        if (num == 2) 
            return true;
        if (num < 2 || num % 2 == 0) 
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) 
                return false;
        return true;
    }
}
