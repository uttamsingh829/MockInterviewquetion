package java8feature;

interface Test1 {
	int add(int a,int b);
}
class Demo1{
	

	public static void main(String[] args) {
		Test1 test1=(a,b)->a+b;
		int x =test1.add(45, 89);
		System.out.println(x);

	}

}
