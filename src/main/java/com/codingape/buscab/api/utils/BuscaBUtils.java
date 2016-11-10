package com.codingape.buscab.api.utils;

import com.codingape.buscab.api.model.Bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BuscaBUtils {

    public static Bar getBarFromMap(Map<String, Object> map) {
        Bar barToReturn = new Bar((String) map.get("id"), (String) map.get("name"), (String) map.get("description"), (String) map.get("address"));
        return barToReturn;
    }


    public static Map<String, Object> getMapFromBar(Bar bar) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", bar.getName());
        map.put("description", bar.getDescription());
        map.put("address", bar.getAddress().toString());
        return map;
    }


}
