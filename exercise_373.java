public class Solution {
    private class Tuple{
        int val;
        int ptr1;
        int ptr2;
        public Tuple(int val, int ptr1, int ptr2){
            this.val = val;
            this.ptr1 = ptr1;
            this.ptr2 = ptr2;
        }
    }

    private class MyComparator implements Comparator<Tuple>{
        public int compare(Tuple a, Tuple b){
            return a.val - b.val;
        }
    }

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new ArrayList<>();
        if(nums1 == null || nums2 == null || 
           nums1.length == 0 || nums2.length == 0) 
           return list;

        PriorityQueue<Tuple> minHeap = new PriorityQueue<Tuple>(new MyComparator());

        for(int i = 0; i < nums1.length && i < k; i++){
                minHeap.offer(new Tuple(nums1[i] + nums2[0], i, 0));
        }

        while(!minHeap.isEmpty() && k > 0){
            Tuple tuple = minHeap.poll();
            int ptr1 = tuple.ptr1;
            int ptr2 = tuple.ptr2;
            list.add(new int[]{nums1[ptr1], nums2[ptr2]});

            if(ptr2 + 1 < nums2.length){
                minHeap.offer(new Tuple(nums1[ptr1] + nums2[ptr2 + 1], ptr1, ptr2 + 1));
            }
            k--;
        }

        return list;
    }
}
