 public class ListNode {
        ListNode prev;
        ListNode next;
        int val;
        int key;
        public ListNode(int v, int k){
            this.val = v;
            this.prev = null;
            this.next = null;
            this.key = k;
        }
}

public class LRUCache {
    
    int size;
    int capacity;
    ListNode head;
    ListNode tail;
    Map<Integer, ListNode> map;
    
    public LRUCache(int capacity) {
        this.head = new ListNode(-1,-1);
        this.tail = new ListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
        this.capacity = capacity;
        this.map = new HashMap<Integer, ListNode>();
    }
    
    public int get(int key) {
        ListNode n = map.get(key);
        if(n != null){
            moveToHead(n);
            return n.val;
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        ListNode n = map.get(key);
        if(n == null){
            n = new ListNode(value, key);
            attachToHead(n);
            size++;
        } else {
            n.val = value;
            moveToHead(n);
        }
        // 如果更新节点后超出容量，删除最后一个
        if(size > capacity){
            removeLast();
            size--;
        }
        map.put(key, n);
    }
    
    // 将一个孤立节点放到头部
    private void attachToHead(ListNode n){
        n.next = head.next;
        n.next.prev = n;
        head.next = n;
        n.prev = head;
    }
    
    // 将一个链表中的节点放到头部
    private void moveToHead(ListNode n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
        attachToHead(n);
    }
    
    // 移出链表最后一个节点
    private void removeLast(){
        ListNode last = tail.prev;
        last.prev.next = tail;
        tail.prev = last.prev;
        map.remove(last.key);
    }
}
