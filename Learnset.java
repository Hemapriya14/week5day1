package week5.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Learnset {

	public static void main(String[] args) {
		Set<String> company=new HashSet<String>();
		//Set<String> company=new TreeSet<String>();
		//Set<String> company=new LinkedHashSet<String>();
		company.add("Hcl");
		company.add("Tcs");
		company.add("Capgemini");
		company.add("Infosys");
		company.add("Cts");
		
		boolean add=company.add("Qeagle");
		System.out.println(add);
		
		//to add same name qeagle it does not allow duplicate
		boolean add2=company.add("Qeagle");
		System.out.println(add2);
		System.out.println(company);
		System.out.println(company.size());
		
		
		  //there is no sorting(ascending) reverse(descending)it shows error
	       //Collections.reverse(company);
		
		//  there is no index or get method in set to convert list
		List<String> name1=new ArrayList<String>(company);
		 //get indexvalue
	       System.out.println(name1.get(3));
	
	      
	}

}
