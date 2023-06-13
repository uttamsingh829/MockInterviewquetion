package arrayas;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	String name;
	String city;
	int age;
	
	public Customer(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(city);
	}

}
