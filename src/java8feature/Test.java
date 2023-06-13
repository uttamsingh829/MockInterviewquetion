package java8feature;

interface Test {

	void show();
}

class Demo { 

	public static void main(String[] args) {
		Test test = () -> System.out.println("Welcome");
		test.show();
	}

}
