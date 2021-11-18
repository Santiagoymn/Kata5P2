package kata5p2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Histogram<T> {
    
    private final Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T Key){
        return this.map.get(Key);
    }
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment(T Key){
        this.map.put(Key, map.containsKey(Key)?this.get(Key) + 1: 1);
    }
}

