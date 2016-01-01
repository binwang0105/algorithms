public class Solution {
     public static boolean wordPattern(String pattern, String str) {
	       
	        if(pattern.isEmpty() || str.isEmpty())
	           return false;
	       
	        HashMap<String, Character> map = new HashMap<String, Character>();
	       
	        String[] strArray = str.split(" ");
	        
	        //比较字符串别忘记先判断两个字符串长度是否想同，不同的话就没有比较下去的意义了
	        
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

//将char[]转化为String使用String.valueOf()
//map.get(key)可以得到key对应的键值