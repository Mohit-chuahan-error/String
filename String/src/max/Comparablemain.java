package max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparablemain {
public static void main(String[] args) {
	ArrayList<Comaparabel> ar=new ArrayList<>();
	
	ar.add(new Comaparabel(32,"mohit",52));
	ar.add(new Comaparabel(24,"Shiavm",23));
	ar.add(new Comaparabel(34,"nishant",28));
	ar.add(new Comaparabel(31,"tushar",73));
	
	Collections.sort(ar, new Comparator<Comaparabel>() {
		@Override
		public int compare(Comaparabel o1, Comaparabel o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getId(), o2.getId());
		}
    });

	for(Comaparabel st:ar){
	System.out.println(st.getId()+" "+st.getName()+" "+st.getage());
	}
	}
}
