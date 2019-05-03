class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        
        long longN = n;
        if(longN < 0) {
            longN = -longN;
            x = 1 / x;
        }
        
        double multi = x, odd = 1;
        while(longN>1){
            if((longN & 1) == 1) odd *= multi;
            multi *= multi;
            longN = longN/2;
        }
        return multi*odd;
        
    }
}