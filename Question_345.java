class Solution {
    public String reverseVowels(String s) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U' };
        Stack<Character> vowelStack = new Stack<Character>();
        String temp = "";
        String result = "";
        for(int i=0; i<s.length(); i++){
            if(Arrays.asList(vowels).contains((Character)s.charAt(i))){
                temp +=  'a';
                vowelStack.push(s.charAt(i));
            }else{
                temp += s.charAt(i);
            }
        }
        
        for(int i=0; i<temp.length(); i++){
            if(temp.charAt(i)=='a' && !vowelStack.isEmpty()){
                result = result +  vowelStack.pop();
            }else{
                result = result + temp.charAt(i);
            }
        }
        
        return result;
        
    }
}
