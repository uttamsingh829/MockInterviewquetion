package string;

import java.util.HashMap;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		int[]a= {1,1,2,2,2,3,3,4,4,4,4,5,5,6};
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		for(int i:a) {
			if (hashMap.containsKey(i)) {
				hashMap.put(i, hashMap.get(i)+1);
				
				
			}else {
				hashMap.put(i, 1);
			}
		}
hashMap.forEach((key,value)->{System.out.println(key+" "+value);});
	}

}
