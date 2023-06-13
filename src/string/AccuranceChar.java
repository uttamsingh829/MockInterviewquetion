package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccuranceChar {
	
		public static void main(String[]args){
		String s="Uttamsingh";
		Map<String,Long>map=s.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(map);
		}
		}


