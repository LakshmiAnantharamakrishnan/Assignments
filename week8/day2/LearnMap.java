package week8.day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class LearnMap {

	public static void main(String[] args) {
		 String text="Malayalam";
		 char[] charArray = text.toCharArray();
		 Map<Character,Integer> map= new TreeMap<Character,Integer>();
		 for(char ch:charArray)
		 {
		 if(map.containsKey(ch))
		 {
			 map.put(ch,map.get(ch)+1);
		 }
		 else
		 {
			 map.put(ch,1);
		 }

	}
		
		 System.out.println(map);
		 System.out.println(map.entrySet());
	}
}
