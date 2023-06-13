package collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Papaya");
        
        
        System.out.println("HashSet elements: " + hashSet);
    }
	}


