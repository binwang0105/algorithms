public class Solution {
        public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        Map<String, Integer> distMap = new HashMap<String, Integer>(); 
        getDistance(beginWord, endWord, wordList, distMap);
        List<List<String>> res = new ArrayList<List<String>>();
        dfs(res, new ArrayList<String>(), distMap, wordList, endWord, beginWord);
        return res;
    }
    
    public void dfs(List<List<String>> res, List<String> cur, Map<String, Integer> distMap, Set<String> wordList, String word, String des) {
        if (word.equals(des)) {
            List<String> list = new ArrayList<String>(cur);
            list.add(des);
            Collections.reverse(list);
            res.add(list);
            return;
        }
        
        cur.add(word);
        for (int i = 0; i < word.length(); i++) {
            char[] chars = word.toCharArray();
            for (char c = 'a'; c <= 'z'; c++) {
                chars[i] = c;
                String nextWord = new String(chars);

                // 不仅字典中含有，两字符串也是要在路径的相邻位置即距离差1
                if (distMap.containsKey(nextWord) && distMap.get(nextWord) == distMap.get(word) - 1) {
                    dfs(res, cur, distMap, wordList, nextWord, des);
                }
            }
        }
        cur.remove(cur.size() - 1);
    }
    
    public void getDistance(String beginWord, String endWord, Set<String> wordList, Map<String, Integer> distMap) {
        distMap.put(beginWord, 1);
        Queue<String> q = new LinkedList<String>();
        q.add(beginWord);
        
        while (!q.isEmpty()) {
            String word = q.remove();
            for (int j = 0; j < word.length(); j++) {
                char[] chars = word.toCharArray();
                for (char c = 'a';  c <= 'z'; c++) {
                    chars[j] = c;
                    String nextWord = new String(chars);
                    if (nextWord.equals(endWord)) {
                        distMap.put(nextWord, distMap.get(word) + 1);
                        return;
                    }
                    if (wordList.contains(nextWord) && !distMap.containsKey(nextWord)) {
                        distMap.put(nextWord, distMap.get(word) + 1);
                        q.add(nextWord);
                    }
                }
            }
        }
    }
}