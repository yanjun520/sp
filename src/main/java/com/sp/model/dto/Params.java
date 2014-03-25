package com.sp.model.dto;

import java.util.HashMap;
import java.util.Map;


public class Params {

    private Map<String, String> map = new HashMap<String, String>();
    
    public Map<String, String> getMap() {
        return map;
    }
    
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    
    public String get(String key) {
        return map.get(key);
    }
    
    public void set(String key, String value) {
        map.put(key, value);
    }
    
}
