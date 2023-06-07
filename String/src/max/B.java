package max;

import java.util.HashMap;
import java.util.List;

public class B {
public static void main(String[] args) {
	List<Integer> a=List.of(3,5,3,5,7,3,3,2,5);

	String s="mohhittt chuahnaaaaa";
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	
	for(char i:s.toCharArray()) {
		if(!hm.containsKey(i)) {
			hm.put(i, 1);
		}
		else
			hm.put(i, hm.get(i)+1);
	}
	
	System.out.println(hm);
}
}
