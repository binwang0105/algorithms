public class Solution {
int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int totalArea = (C-A)*(D-B) + (G-E)*(H-F); //��������
    int leftX = Math.max(A,E);//��������������
    int rightX = Math.min(G,C); //ע�����ﲻ���ж��������ε�λ�ã������Ǹ���������߻��������棬��Щ���۶�����
    int leftY = Math.max(B,F);
    int rightY = Math.min(D,H);
    if(rightX <= leftX || rightY <= leftY)
        return totalArea;
    else
        return totalArea-(rightX-leftX)*(rightY-leftY);
}
}