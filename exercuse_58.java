public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        if(s.length() >= 1 && s.charAt(s.length()-1)==' ')
            s = s.trim();
        //记得把字符串两端的空格去掉
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' '){
                length = 0;
                continue;
            }
            length++;
        } 
        return length;
    }
}

//如何寻找最后一个空格？charAt循环，每次都算length然后碰到空格就清0