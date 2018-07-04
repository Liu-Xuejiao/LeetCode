import java.util.Vector;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        	int answer[] = new int[2];
        Vector v = new Vector();
        for(int i : nums){
        	v.add(i);
        }
        for(int i=0;i<nums.length;i++){
        	int c = target - nums[i];
        	if(v.contains(c)){
        		int index = v.indexOf(c);
        		if(index != i){
        			answer[1] = i;
            		answer[0] = index;
                    break;
        		}
                
        	}
        }
        return answer;
    }
}
