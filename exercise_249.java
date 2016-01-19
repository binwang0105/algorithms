public class Solution {
      public List<List<String>> groupStrings(String[] strings) {
        
        //used to store result
        List<List<String>> res = new ArrayList<List<String>>();
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        Arrays.sort(strings); 
        
        for(String str : strings){

            StringBuffer ke = new StringBuffer();

            for (int i = 1; i < str.length(); i++) { 
                ke.append((str.charAt(i) - str.charAt(i-1) + 26) % 26);
            }
            
            String key = ke.toString();
            
            //if not contains this key 
            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            
            map.get(key).add(str); 
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}