import java.lang.Math;
class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        int sizeX = binaryX.length();
        int sizeY = binaryY.length();
        
        for(int i=0; i<Math.max(sizeX,sizeY); i++){
            
            int X,Y;
            if(sizeX > i){
                X = Character.getNumericValue(binaryX.charAt(sizeX-1-i));
            }else{
                X = 0;
            }
            
            if(sizeY > i){
                Y = Character.getNumericValue(binaryY.charAt(sizeY-1-i));
            }else{
                Y = 0;
            }
            
            if(X != Y){
                result++;
            }
            
        }
        return result;
    }
}
