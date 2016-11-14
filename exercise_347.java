public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //collect the <nums,count> in a hashmap
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n, 0)+1);
    }
    //store the <nums,count> in a PriorityQueue sorted by minHeap order
    PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<Map.Entry<Integer,Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {
        public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
            return a.getValue()-b.getValue();
        }
    });
     for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
        pq.offer(entry);
        if (pq.size() > k) pq.poll();
    }
    List<Integer> res = new ArrayList<>();
    while (res.size() < k) {
        Map.Entry<Integer, Integer> entry = pq.poll();
        res.add(entry.getKey());
    }
    return res;
    }
}