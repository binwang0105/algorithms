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
/*public int lengthOfLastWord(String s) {
    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
}
*/
//���Ѱ�����һ���ո�charAtѭ����ÿ�ζ���lengthȻ�������ո����0
//��μ����ַ����ĳ��ȣ�ʹ��length1-length2 or �ַ���1��β����-�ַ���2��β������