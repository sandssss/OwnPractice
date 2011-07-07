package com.practice.commmon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTraverseUtil {
	
	public static void traverseMap_1 (Map<String, String> map) {
		for(String key : map.keySet()) {
			String value = map.get(key);
		}
	}
	
	public static void traverseMap_2 (Map<String, String> map) {
		for(Entry<String, String> entry :map.entrySet()) {
			String value = entry.getValue();
		}
	}
	
	public static Map<String, String> createTestMap(int num) {
		Map<String, String> map = new HashMap<String, String>(num);
		return map;
	}
}
