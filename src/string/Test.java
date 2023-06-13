package string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "str";
        String s1 = new String("str");
        String s2 = new String("str");
        if(s.equals(s1))
            System.out.println("true 1st condition");
        if(s==s1)
            System.out.println("true 2nd condition");
        if(s==s1.intern())
            System.out.println("true 3rd condition");
        if(s1==s2)
            System.out.println("true 4th condition");
        if(s1.intern()==s2.intern())
            System.out.println("true 5th condition");	

	}

}
