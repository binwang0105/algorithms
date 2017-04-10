public class Solution {
    public boolean wordPatternMatch(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        return match(pattern, 0, str, 0, map, set);
    }
    
    public boolean match(String pattern, int i, String str, int j, HashMap<Character, String> map, Set<String> set){
        // base case
        if(i == pattern.length() && j == str.length()) return true;
        if(i == pattern.length() || j == str.length()) return false;
        
        // ���pattern���ֹ�������char,patternӳ�����Ψһ��
        // ���ӳ����ȷ��go deeper
        Character c = pattern.charAt(i);
        if(map.containsKey(c)){
            String s = map.get(c);
            if(!str.startsWith(s, j)){
                return false;
            }
            return match(pattern, i+1, str, j+s.length(), map, set);
        }
        
        // ���ϳ���pattern�����ؿ��ܵ��������һ���������������ȫ�ֳ�����
        for(int k=j; k<str.length(); k++){
            String sub = str.substring(j, k+1);
            if(set.contains(sub)) continue;
            
            map.put(c, sub);
            set.add(sub);
            
            if(match(pattern, i+1, str, k+1, map, set)){
                return true;
            }
            
            map.remove(c);
            set.remove(sub);
        }
        
        return false;
    }