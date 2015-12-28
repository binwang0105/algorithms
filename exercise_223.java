public class Solution {
int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int totalArea = (C-A)*(D-B) + (G-E)*(H-F); //求出总面积
    int leftX = Math.max(A,E);//求出两个点的坐标
    int rightX = Math.min(G,C); //注意这里不用判断两个矩形的位置，无论那个矩形在左边或者在上面，这些结论都满足
    int leftY = Math.max(B,F);
    int rightY = Math.min(D,H);
    if(rightX <= leftX || rightY <= leftY)
        return totalArea;
    else
        return totalArea-(rightX-leftX)*(rightY-leftY);
}
}