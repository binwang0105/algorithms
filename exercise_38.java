public class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String str = countAndSay(n-1) + "*";   //这里加*非常有必要，防止空指针
        char[] c = str.toCharArray();
        String s = "";
        int counter = 1;
        for(int i = 0; i < c.length-1; i++){
            if(c[i] == c[i+1])
                counter++;
            else{
                s = s + counter + c[i];
                counter = 1;//?
            }
        }
        return s;
    }
}

//http://blog.csdn.net/xygy8860/article/details/46821417