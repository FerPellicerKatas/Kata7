package kata7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram<T> {
    private String dimension;
    private String filter;
    private String bin;
    private Map<T, Integer> map;

    public Histogram(String dimension, String filter, String bin) {
        this.map = new HashMap<T, Integer>();
        this.filter = filter;
        this.dimension = dimension;
        this.bin = bin;
    }
    
    public Integer get(T key) {
        return this.map.get(key);
    } 
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment(T key) {
        if (this.map.containsKey(key)) {
            int currentCount = this.map.get(key);
            this.map.put(key, currentCount + 1);       
             
        } else {
          this.map.put(key, 1);
        }
    }  
}
