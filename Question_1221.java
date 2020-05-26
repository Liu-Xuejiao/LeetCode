class Solution {
    public int balancedStringSplit(String s) {
        Deque<Character> stack = new LinkedList<>();
        int count = 0;
        
        for(char a: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(a);
                count ++;
            }else{
                if(a=='R'){
                    if(stack.peek()=='L'){
                        stack.pop();
                    }else{
                        stack.push('R');
                    }
                }else{
                    if(stack.peek()=='R'){
                        stack.pop();
                    }else{
                        stack.push('L');
                    }
                }
            }
        }
        
        return count;
    }
}
