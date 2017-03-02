package casual;

import java.util.ArrayList;
import java.util.Collections;
public class ArList {

	public static void sortArrayDemo()
	{
		ArrayList<String> arList = new ArrayList<>(4);
		int index;

		arList.add("Larry");
		arList.add("Curly");
		arList.add("Moe");
		// arList.add("Shemp");
		index = arList.indexOf("Curly");
		
		
		arList.set(index, "Shemp");
		
		System.out.printf("Size: %d%n", arList.size());
		// Collections.sort(arList);
		
		// sort
		
		// short sort list?
		// remove entry
		// add a fifth string
		
		// Array List
		
		for (String foo : arList)
		{
			System.out.println(foo);
		}
		
		// ^^^ these are the same vvv
		
		for (int i=0; i < arList.size(); i++)
		{
			System.out.println(arList.get(i));
		}
	}
	public static void main(String[] args) {
		sortArrayDemo();

	}

}
