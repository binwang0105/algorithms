public class ValidWordAbbr {

    HashMap<String,String> map = new HashMap<String,String>();
    
    public ValidWordAbbr(String[] dictionary) {
        
        for(String s:dictionary){
        
            if(s.length()<=2)
                continue;
            
            String c= s.charAt(0) + String.valueOf(s.length()-2) + s.charAt(s.length()-1);
            
            if(!map.containsKey(c)){
                map.put(c,s);
            }else{
                //if(!map.get(c).equals(s))//check duplicate string
                map.put(c,"");
            }
    }
}

    public boolean isUnique(String word) {

        if(word.length()<=2)
            return true;
            
        String s=word.substring(0,1)+String.valueOf(word.length()-2)+word.substring(word.length()-1);
        return !map.containsKey(s)||map.get(s).equals(word);
    }
}
