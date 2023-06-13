package collection;

import java.util.HashSet;

public class UserClient {

	 public static void main(String[] args) {
	        HashSet<User> userSet = new HashSet<>();
	        User user1 = new User("Uttam", 25, "Uttam@gmail.com");
	        User user2 = new User("Pd", 30, "Pd@gmail.com");
	        User user3 = new User("Naresh", 25, "Nn@gmail.com");
	        User user4 = new User("Uma", 25, "Uma@gmail.com");
	        User user5 = new User("Pavan", 30, "P@gmail.com");
	        User user6 = new User("Nelesh", 25, "N@gmail.com");
              userSet.add(new User("ravi",29,"ravi@gmail.com"));

	        userSet.add(user1);
	        userSet.add(user2);
	        userSet.add(user3);
	        userSet.add(user4);
	        userSet.add(user5);
	        userSet.add(user6);


	        System.out.println(userSet.toString()+"\n"); 
	    }
	}



