public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        if(s.length() >= 1 && s.charAt(s.length()-1)==' ')
            s = s.trim();
        //�ǵð��ַ������˵Ŀո�ȥ��
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

//���Ѱ�����һ���ո�charAtѭ����ÿ�ζ���lengthȻ�������ո����0