package week5.day2;


import java.util.LinkedList;
import java.util.List;

public class LearnLinked {

	public static void main(String[] args) {
		List<String> name=new LinkedList<String>();
        name.add("Blue");
        name.add("Green");
        name.add("Yellow");
        name.add("Orange");
        name.add("Brown");
        name.add("Black");
        
        for(String value : name) {
        	System.out.println(value);
        }
        System.out.println(name);
        
        
    
	}

}
