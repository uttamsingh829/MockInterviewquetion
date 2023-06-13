package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap hs= new HashMap();
		hs.put(102,"uttam");
		hs.put(101,"uk");
		hs.put(101,"atul");
		hs.put(101,"umer");
		hs.put(101,"ravi");
		hs.put(101,"pooja");
		System.out.println(hs);
		
       System.out.println(hs.put(103,"uk"));
       Set set= hs.keySet();
       System.out.println(set);
       Iterator itr=Iterator();
       while(itr.hasNext()) {
    	   Map.Entry m1=(Map.Entry)itr.next();
    	   System.out.println(m1.getKey()+"...."+m1.getValue());
    	   
       }
	}

	private static Iterator Iterator() {
		// TODO Auto-generated method stub
		return null;
	}  

}
