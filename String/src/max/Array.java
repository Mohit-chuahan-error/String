package max;

import java.util.HashMap;
import java.util.Map;

public class Array {
public static void main(String[] args) {
	Integer[] ar= {2,3,5,6,6,2,3,6,7};
	HashMap<Integer,Integer> hmm=new HashMap<>();
	for(Integer i:ar) {
		
		if(!hmm.containsKey(i)) {
			hmm.put(i, 1);
		}
		else
			hmm.put(i,hmm.get(i)+1);
	}
	//System.out.println(hmm);
	for( Map.Entry j:hmm.entrySet()) {
		int values=(int) j.getValue();
		if(values>1) {
			System.out.println("repeated ="+" "+j.getKey());
		}
	}
}
}
