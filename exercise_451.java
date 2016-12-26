public class Solution {
    public String frequencySort(String s) {
        if(s == null)
            return null;
        
        //count the frequency of each character in the string
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(!map.containsKey(tmp)){
                map.put(tmp, 0);
            } 
            int count = map.get(tmp)+1;
            max = Math.max(count, max);
            map.put(tmp, count);
        }
        
        //create an array which index represents frequency of character
        List<Character>[] charArr = buildArray(map, max);
        
        //append character to stringbuilder
        StringBuilder sb = new StringBuilder();
        int i = charArr.length-1;
        while(i >= 0){   //陷入了死循环，没有加i--
            List<Character> list = charArr[i];
            if(list != null){
                for(Character c : list){
                    for(int j = 0; j < i; j++){
                        sb.append(c);
                    }
                }
            }
            i--;
        }
        return sb.toString();
    }
    
    private List<Character>[] buildArray(HashMap<Character, Integer> map, int max){
        List<Character>[] res = new ArrayList[max+1]; //一个是坐标另一个是size一定要加1
        for(Character c : map.keySet()){
            int count = map.get(c);
            if(res[count] == null) //List array先判断空不空
                res[count] = new ArrayList<Character>();
            res[count].add(c);
        }
        return res;
    }
}