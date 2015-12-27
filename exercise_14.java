public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(pre)!=0){
                pre = pre.substring(0, pre.length()-1);
            }
        }
        return pre;
    }
}
/* indexOf:
1. int indexOf(int ch) ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ��������� 
int indexOf(int ch, int fromIndex) ��ָ����������ʼ�����������ڴ��ַ����е�һ�γ���ָ���ַ����������� 
2. int indexOf(String str) ���ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е������� 
3. int indexOf(String str, int fromIndex) ��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е������� 
*/

/* substring(int startposition, int endposition)
1. ȡ��start��ʼ��end�������Ӵ�

method:
1. find the standard
2. compare with others
3. not same, length - 1 and try again
*/