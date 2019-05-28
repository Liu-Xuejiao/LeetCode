class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length+1;
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        for(int i=0; i<size; i++){
            arrli.add((Integer)i);
        }
        
        
        for(int num : nums){
            arrli.remove((Integer)num);
        }
        
        if(!arrli.isEmpty()){
            return arrli.get(0);
        }
        
        return size;
    }
}
