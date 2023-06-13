package arrayas;

import java.util.Objects;

public class HashcodeAndEquals {

	public static void main(String[] args) {
	    
	    	/*
	    	Hashcode and equal method contract says
	    	1) If two objects are equal, then they must have the same hash code.
	    	2) If two objects have the same hash code, they may or may not be equal.
	    	 */
	    	        Employee e1 = new Employee();
	    	        e1.setFirstName("Uttam");
	    	        e1.setLastName("Singh");
	    	        /*Employee e2 = new Employee();
	    	        e2.setFirstName("Uttam");
	    	        e2.setLastName("Singh");*/
	    	       // System.out.println("e1 hashcode = "+e1.hashCode()+" and e2 hashcode = "+e2.hashCode());
	    	        Employee e3 = e1;

	    	        if(e1 == e3){
	    	            System.out.println("referece of e1 and e3 are equal");
	    	        }
	    	       /* if(e1.equals(e2)){
	    	            System.out.println("Object e1 and e2 both are equals");
	    	        }*/
	    	        if(e1.equals(e3)){
	    	            System.out.println("Object e1 and e3 both are equals");
	    	        }

	    	       /* String s1 = "Uttam";
	    	        String s2 = "Uttam";
	    	        if(s1 == s2){
	    	            System.out.println("referece of s1 and s2 are equal");
	    	        }*/

	    	        // e1 and e2 are equal. e1 hashcode =212123 then e2 hashcode =212123
	    	        //
	    	    }
	    	}

	    	class Employee extends Object{
	    	    private String firstName;
	    	    private String lastName;

	    	    public String getFirstName() {
	    	        return firstName;
	    	    }

	    	    public void setFirstName(String firstName) {
	    	        this.firstName = firstName;
	    	    }

	    	    public String getLastName() {
	    	        return lastName;
	    	    }

	    	    public void setLastName(String lastName) {
	    	        this.lastName = lastName;
	    	    }

	    	    public int getAge() {
	    	        return age;
	    	    }

	    	    public void setAge(int age) {
	    	        this.age = age;
	    	    }

	    	    public String getEmail() {
	    	        return email;
	    	    }

	    	    public void setEmail(String email) {
	    	        this.email = email;
	    	    }

	    	    private int age;
	    	    private String email;

	    	   @Override
	    	    public boolean equals(Object o) {
	    	        System.out.println("references are being checked.");
	    	        if (this == o) return true;
	    	        System.out.println("If references are not equal");
	    	        if (o == null || getClass() != o.getClass()) return false;
	    	        Employee employee = (Employee) o;
	    	        return this.age == employee.age && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.email, employee.email);
	    	    }

	    	    @Override
	    	    public int hashCode() {
	    	        return Objects.hash(firstName,lastName,email,age);
	    	    }
	    	


	}


