package week5.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learnlist {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
           name.add("Blue");
           name.add("Green");
           name.add("Yellow");
           name.add("Orange");
           name.add("Brown");
           name.add("Black");
       System.out.println(name.size());    //find size
           
         //add name
       name.add("Purple");
System.out.println(name.size());
      
        name.add(1,"Red");
        
        
    //remove name
        name.remove("Yellow");
        System.out.println(name);
        
        //check any name
        System.out.println(name.contains("Brown"));
        
        //clear list of all name
        //name.clear();
        System.out.println(name.isEmpty());
        
        //get indexvalue
       // System.out.println(name.get(4));
        System.out.println(name.get(name.size()-4));
        
        //sort ascending
       // System.out.println(name.get(3));
        Collections.sort(name);
        System.out.println(name);
        
        //sort descending
        Collections.reverse(name);
        System.out.println(name);
	}

}
