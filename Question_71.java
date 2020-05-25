class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        ArrayList<String> result = new ArrayList<String>();
        
        for(int i=0; i<pathArray.length; i++){
            if(pathArray[i].equals("..")){
                if(!result.isEmpty()){
                   result.remove(result.size()-1); 
                }
            }else if(pathArray[i].equals(".") || pathArray[i].equals("")){
            }else{
                result.add(pathArray[i]);
            }
        }
                
        String resultPath = "";
        if(result.isEmpty()){
            return "/";
        }
        for(int i=0; i<result.size(); i++){
            
            resultPath =resultPath+ '/'+result.get(i);
        }
        return resultPath;
    }
}
