public class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int ret = 0;
        int tmp = 0;
        for(int i = 0; i < c.length; i++){
            tmp = (int)c[i] + 1;   //�õ���λ
            ret = ret * 26 + (int)(tmp - 'A');    //�õ�֮ǰ��λ�Լ���λ�ĺ�
        }
        return ret;
    }
}

// �߽���ת��Ϊ�ͽ���