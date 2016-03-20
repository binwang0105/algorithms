public class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        String temp = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i)>='a' && temp.charAt(i)<='z'){
                sb.append(temp.charAt(i));
                continue;
            }
            if(temp.charAt(i)>='0' && temp.charAt(i)<='9'){
                sb.append(temp.charAt(i));
                continue;
            }
        }
        String postString = sb.toString();
        for(int j = 0; j < postString.length()/2; j++){
            if(postString.charAt(j) != postString.charAt(postString.length()-1-j))
                return false;
        }
        //String reverseString = sb.reverse().toString();
        //return postString.equals(reverseString);
        return true;
    }
}
