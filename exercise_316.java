public class Solution {
    public String removeDuplicateLetters(String s) {
        
        StringBuffer sb = new StringBuffer();
        
        //store frequencies of 26 lowcase letters
        HashMap<Character, Integer> letterTimes = new HashMap<Character, Integer>();
        //��Ϊ��new�ģ����Զ���0
        
        for(int i = 0; i < s.length(); i++){
            if(letterTimes.containsKey(s.charAt(i))){
                continue;
            }
            else{
                letterTimes.put(s.charAt(i), 1);
            }
        }
        
        char c='a';
        
        //����26�Σ�һ��һ��ȥ�ȶ�
        for(int i = 0; i < 25; i++){
            if(letterTimes.containsKey(c)){
                sb.append(c);
            }
            c = (char)(c + 1);
        }
        
        return sb.toString();
    }
}