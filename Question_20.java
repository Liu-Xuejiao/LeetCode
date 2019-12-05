class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if(s.equals("")){
            return true;
        }
        
        int length = s.length();
       
        for(int i=0; i<length; i++){
            char c = s.charAt(i);
            
            switch(c){
                case ')': 
                    if((!st.empty())&&(st.peek() == '(')){
                        st.pop();
                    }else{
                        st.push(c);
                    }
                    break;
                case '}':
                    if((!st.empty())&&(st.peek() == '{')){
                        st.pop();
                    }else{
                        st.push(c);
                    }
                    break;
                case ']':
                     if((!st.empty())&&(st.peek() == '[')){
                        st.pop();
                    }else{
                        st.push(c);
                    }
                    break;
                default:
                    st.push(c);
            }
            
        }
        
        return st.empty();
    }
}
