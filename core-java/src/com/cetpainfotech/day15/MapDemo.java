package com.cetpainfotech.day15;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.cetpainfotech.day14.NumberComparator;
public class MapDemo {
	
	

	
	
	public static void main(String[] args) {
		

		Map<Integer,String> map = new TreeMap<Integer,String>(new NumberComparator());
		
		// add  
		map.put(1011, "kumar");
		map.put(1014, "ankit");
		map.put(1015, "Krishna");
		map.put(1010, "krishna");
		
		map.put(1010, "Abhilash");
		//System.out.println(map.put(1010, "Abhilash"));
		
		
		System.out.println(map);
		
		// retriving
		
		//System.out.println(map.getOrDefault(1011,"Guest").toUpperCase());
		
		// searching 
		
		//System.out.println(map.containsKey(1011));
		//System.out.println(map.containsValue("krishna"));
		
		//map.remove(1011);
		//map.remove(1010, "Abhilash");
		//map.replace(1010, "Nithin");
		
		//map.clear();
	//	map.putIfAbsent(1080, "Ramesh");
	//	System.out.println(map);
		
		
		// Collection View Of Map
	/*	
	Set<Integer> keys =	map.keySet();
	
	System.out.println(keys);
Collection<String> values =	map.values();
System.out.println(values);

Set<Map.Entry<Integer, String>> entryset = map.entrySet();

  Iterator<Map.Entry<Integer, String>> itr =    entryset.iterator();
  
  while(itr.hasNext())
  {
	  Map.Entry<Integer, String> entry = itr.next();
	  
	  System.out.println(entry.getKey()+" -> "+entry.getValue());
  }
*/
  
	}

}
