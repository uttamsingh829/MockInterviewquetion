  package com.uk;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " (" + age + ")";
	}


//public class CustomListExample {
	public static void main(String[] args) {
		// Create a Person object
		Person p = new Person("John", 30);

		// Add the Person object to an ArrayList
		List<Person> arrayList = new ArrayList<>();
		arrayList.add(p);

		// Add the Person object to a LinkedList
		List<Person> linkedList = new LinkedList<>();
		linkedList.add(p);

		// Add the Person object to a Vector
		List<Person> vector = new Vector<>();
		vector.add(p);

		// Add the Person object to a Stack
		Stack<Person> stack = new Stack<>();
		stack.push(p);

		// Add the Person object to a CopyOnWriteArrayList
		List<Person> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add(p);

		// Iterate over the ArrayList and display each Person object
		System.out.println("ArrayList:");
		for (Person person : arrayList) {
			System.out.println(person);
		}

		// Iterate over the LinkedList and display each Person object
		System.out.println("LinkedList:");
		for (Person person : linkedList) {
			System.out.println(person);
		}

		// Iterate over the Vector and display each Person object
		System.out.println("Vector:");
		for (Person person : vector) {
			System.out.println(person);
		}

		// Iterate over the Stack and display each Person object
		System.out.println("Stack:");
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

		// Iterate over the CopyOnWriteArrayList and display each Person object
		System.out.println("CopyOnWriteArrayList:");
		for (Person person : copyOnWriteArrayList) {
			System.out.println(person);
		}
	}
}
