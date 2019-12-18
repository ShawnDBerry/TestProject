package testCodeClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateString {

	public void PrintDubs(List<String> list) {
		// TODO Auto-generated method stub
		 list = new ArrayList<>();
				list.add("Monique");
				list.add("Andre");
				list.add("Joel");
				list.add("Marco");
				list.add("Dalo");
				list.add("Andrew");
				list.add("Chris");
				list.add("Jaime");
				list.add("Trung");
				list.add("Trung");
				list.add("Monique");
				list.add("Adrian");
				list.add("Dalo");
				Set<String> s = new HashSet<String>();

				for (String name : list) {
					if (s.add(name) == false)
						System.out.println(name + " is duplicated");
				}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		PrintDuplicateString searchList = new PrintDuplicateString();
		
		searchList.PrintDubs(list);
		// TODO Auto-generated method stub

	}

}
