public class LRUCache {
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode next;
        DLinkedNode prev;
    }
    public void addNode(DLinkedNode node){
        //add node right of head
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void removeNode(DLinkedNode node){
        //remove this node from the LL
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    private void moveToHead(DLinkedNode node){
        //move certain node to the head
        removeNode(node);
        addNode(node);
    }
    private DLinkedNode popTail(){
        //pop the current tail
        DLinkedNode currNode = tail.prev;
        removeNode(currNode);
        return currNode;
    }
    private Map<Integer,DLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head;
    private DLinkedNode tail;
    
    
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
            //head.prev = null;
        tail = new DLinkedNode();
            //tail.next = null;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if(node == null){
            return -1;
        }
        //move the accessed node to the head;
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key,newNode);
            addNode(newNode);
            size++;
            if(size > capacity){
                //pop the tail
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                size--;
            }
        }else{
            //update the value
            node.value = value;
            moveToHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


 /*
 Dummy Head -- middle of nodes -- Dummy Tail