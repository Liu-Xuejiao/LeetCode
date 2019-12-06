class Solution {
    public String defangIPaddr(String address) {
        int size = address.length();
        int count = size;
        
        for(int i=0; i<size-1; i++){
            if(address.charAt(i) == '.')
                count += 2;
        }   
    
        char[] chara = new char[count];
        int index = 0;
        
        for(int i=0; i<count; i++){
            if((index < size) && (address.charAt(index) == '.')){
                chara[i] = '[';
                chara[i+1] = address.charAt(index);
                chara[i+2] = ']';
                
                i += 2;
            }else{
                chara[i] = address.charAt(index);
            }
            index ++;
        }  
        
        return new String(chara);
    }
}
