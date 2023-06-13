package com.uk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StudentArrayListExample {

	public static void main(String[] args) {
		 List<Students> arrayList = new ArrayList<Students>();
		 arrayList.add(new Students("Uttam",30));
		 arrayList.add(new Students("Pd",30));
		 arrayList.add(new Students("Vk",33));
		 arrayList.add(new Students("Sk",30));
		 arrayList.add(new Students("Ns",30));
		 arrayList.add(new Students("ND",30));
		 arrayList.add(new Students("Uttam", 30));
	/* for(Students x:arrayList) {
		 
		 System.out.println(x);
		 */
		/* Iterator itr=arrayList.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
			 
			 */
		  Set<Students> set = new HashSet<Students>();
	        List<Students> duplicateElements = new ArrayList<Students>();

	        for (Students element : arrayList) {
	            if (!set.add(element)) {
	                duplicateElements.add(element);
	            }
	        }

	        System.out.println("Duplicate elements in the ArrayList: " + duplicateElements);
	
			/*
			 * Collections.reverse(arrayList); System.out.println(arrayList+"");
			 */
		}
	 }

	   //out put:Duplicate elements in the ArrayList: [Students [name=Uttam, age=30]]
	
	
	

	
	
	



