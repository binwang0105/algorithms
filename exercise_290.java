public class Solution {
     public static boolean wordPattern(String pattern, String str) {
	       
	        if(pattern.isEmpty() || str.isEmpty())
	           return false;
	       
	        HashMap<String, Character> map = new HashMap<String, Character>();
	       
	        String[] strArray = str.split(" ");
	        
	        //�Ƚ��ַ������������ж������ַ��������Ƿ���ͬ����ͬ�Ļ���û�бȽ���ȥ��������
	        
	        if (strArray.length != pattern.length()) {
	            return false;
	        }
	        
	        char[] c = new char[strArray.length];
	        
	        for(int i = 0; i < strArray.length; i++){
	            if(!map.containsKey(strArray[i]))
	                map.put(strArray[i], (char)('a' + (i % 26)));
	        }
	        
	        for(int i = 0; i < strArray.length; i++){
	            c[i] = map.get(strArray[i]);
	            //System.out.println(c[i]);
	        }
	        
	        String stc = String.valueOf(c);
	        return c.toString().equals(pattern);
	    }
}

//��char[]ת��ΪStringʹ��String.valueOf()
//map.get(key)���Եõ�key��Ӧ�ļ�ֵ