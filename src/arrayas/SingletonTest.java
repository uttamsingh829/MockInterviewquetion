package arrayas;

public class SingletonTest{
public static void main(String[]args){
TestSingleton obj1= TestSingleton.getInstance();
TestSingleton obj2= TestSingleton.getInstance();
System.out.println("obj1"+obj1.toString());
System.out.println("obj2"+obj2.toString());
}
}
class TestSingleton{
static TestSingleton obj= new TestSingleton();
private TestSingleton(){

}

public static TestSingleton getInstance(){
return obj;
}
}