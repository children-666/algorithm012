package Week_08;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache_146 {

}
class LRUCache {

    private Map<Integer,Integer> map;


    public LRUCache(int capacity) {
        map = new LinkedCappedHashMap<>(capacity);
    }

    public int get(int key) {
        if (map.containsKey(key)){
            return -1;
        }
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key,value);
    }
    // 定义新的
    private static class LinkedCappedHashMap<K,V> extends LinkedHashMap<K,V>{
        int maxinumCapacity;

        LinkedCappedHashMap(int maxinumCapacity){
            super(16,0.75f,true);
            this.maxinumCapacity = maxinumCapacity;
        }
        protected boolean removeEldestEntry(Map.Entry eldest){
            return size() > maxinumCapacity;
        }
    }
}