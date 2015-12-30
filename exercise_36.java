public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false;
        for(int i = 0; i < 9; i++){
            if(!isValid(board, i, 0, i, 8))
                return false;
            if(!isValid(board, 0, i, 8, i))
                return false;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                if(!isValid(board, i*3, j*3, i*3+2, j*3+2))
                    return false;
        }
        return true;
    }
    
    public boolean isValid(char[][] array, int x1, int y1, int x2, int y2){
        Set set = new HashSet();
        for(int i = x1; i <= x2; i++){
            for(int j = y1; j <= y2; j++){
                if(array[i][j] != '.') 
                    if(!set.add(array[i][j]))
                        return false;
            }
        }
        return true;
    }
}

//set不用表明其中存放的对象的属性
//set如果添加失败则返回-1，集合内不可以出现重复元素，因此set可以用来去重
//if如果涉及到且条件最好不要并列写条件，使用嵌套写条件