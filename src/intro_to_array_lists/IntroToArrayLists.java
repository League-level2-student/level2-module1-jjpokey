package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> string = new ArrayList<String>();
		//2. Add five Strings to your list
		string.add("1");
		string.add("2");
		string.add("3");
		string.add("4");
		string.add("5");
		//3. Print all the Strings using a standard for-loop
		for(int a = 0; a < string.size(); a++) {
			System.out.println(string.get(a));
		}
		//4. Print all the Strings using a for-each loop
		for(String a : string) {
			System.out.println(a);
		}
		//5. Print only the even numbered elements in the list.
		for(int a = 0; a < string.size(); a++) {
			
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
