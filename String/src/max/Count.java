package max;

import java.util.HashMap;
import java.util.Map;

public class Count {
public static void main(String[] args) {
	String s="my name is mohit chauhan";
	
	int valuee=8;
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(Character i:s.toCharArray()) {
		
		if(!hm.containsKey(i))
		{
		hm.put(i, 1);
	}
	else
		hm.put(i, hm.get(i)+1);
}
	
	for( Map.Entry j:hm.entrySet())
	{
		int value= (int) j.getValue();
		if(value>1) {
			System.out.println(j.getKey()+"="+ j.getValue());
		}		
}}
}
