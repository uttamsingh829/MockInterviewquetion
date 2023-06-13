package map;

import javax.swing.LayoutStyle;

public class Test {
	Student  head;
	class Student{
		String data;
		  Test next;
		  public Student(String name) {
			  this.data=name;
			  this.next=null;
		  }
	}
public Test add(String name,Test list) {
	Test test = new Test();
	if(list.head==null) {
		list.head=test;
		
	}else {
		Student last=last.head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=test;
	}
	return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
