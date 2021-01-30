class LRUCache {
    private LinkedHashMap<Integer, Integer> lhm;
    private final int cap;
    public LRUCache(int capacity) {
        cap = capacity;
        lhm= new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
          protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
              return size() > cap;
          }  
        };
    }
    
    public int get(int key) {
        Integer i = lhm.get(key);
        if (i != null)
            return (int) i;
        else   
            return -1;
    }
    
    public void put(int key, int value) {
        lhm.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


class LRUCache extends LinkedHashMap<Integer,Integer> {
    int cap = 0;
    
    public LRUCache(int capacity) {
        super(capacity,0.75F,true);
        cap = capacity;
    }
    
    public int get(int key) {
        return super.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        super.put(key,value);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
        return size() > cap;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
