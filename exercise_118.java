public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> masterList = new ArrayList<List<Integer>>();
        if (numRows == 0) 
            return masterList;
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        masterList.add(list);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> klist = new ArrayList<Integer>();
            klist.add(1);
            List<Integer> lastList = masterList.get(i-1);
            for(int j = 0; j < lastList.size()-1; j++){
                int element = lastList.get(j) + lastList.get(j+1);
                klist.add(element);
            }
            klist.add(1);
            masterList.add(klist);
        }
        return masterList;
    }
}