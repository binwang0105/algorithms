public class Solution {
    public void reverseWords(char[] s) {
        //�ȷ�ת��������
        reverse(s, 0, s.length - 1);
        
        //�ٶ�ÿ�����ʽ��з�ת
        int start = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] == ' '){
                reverse(s, start, i - 1);
                start = i + 1;
            }
        }
        //reverse the last word
        reverse(s, start, s.length - 1);
    }
    
    private void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}