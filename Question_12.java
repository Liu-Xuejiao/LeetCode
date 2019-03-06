class Solution {
    public String intToRoman(int num) {
        String Roman = "";
        int token = 1000;
        int count = 0;
        int stringNum = 0;
        int [] array = new int[4];
        
        while(num!=0){
            array[count] = num / token;
            num = num % token;
            count ++;
            token = token / 10;
        }
        
        String Q = "M";
        String B = "C";
        String S = "X";
        String G = "I";
        
        Roman = Roman   + new String(new char[array[0]]).replace("\0", Q)
                        +new String(new char[array[1]]).replace("\0", B)
                        +new String(new char[array[2]]).replace("\0", S)
                        +new String(new char[array[3]]).replace("\0", G);

        
        Roman = Roman.replaceAll("CCCCCCCCC","CM");
        Roman = Roman.replaceAll("CCCCC","D");
        Roman = Roman.replaceAll("CCCC","CD");
        
        Roman = Roman.replaceAll("XXXXXXXXX","XC");
        Roman = Roman.replaceAll("XXXXX","L");
        Roman = Roman.replaceAll("XXXX","XL");
        
        Roman = Roman.replaceAll("IIIIIIIII","IX");
        Roman = Roman.replaceAll("IIIII","V");
        Roman = Roman.replaceAll("IIII","IV");       
        
        return Roman;
    }
}
