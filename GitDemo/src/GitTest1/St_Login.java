//Encapsulation, is to make sure that "sensitive" data is hidden from users.
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable
//The get method returns the variable value, and the set method sets the value.


package GitTest1;

import java.util.*;
import java.util.Scanner;

public class St_Login {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Welcome to Sharon School System");
		ArrayList<String> names = new ArrayList<String>( Arrays.asList("Aariz","Leo","Messon","Taniya","Emily") );
		 
		System.out.println(names);
	//	ArrayList<String> name = Arrays.asList("Aariz","Leo","Messon","Taniya","Emily");

		//ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<Integer> id = new ArrayList<Integer>(Arrays.asList(101,102,103,104,105));
		System.out.println(id);

		//taking new name from user
		//System.out.println("Please enter UserName");
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter a Username: ");
		String str= sc.nextLine(); //reads string.
		
		names.add(str);
		System.out.println(names);
		
	//taking new id from user
				//System.out.println("Please enter Id:");
				Scanner sc1= new Scanner(System.in); //System.in is a standard input stream.
				System.out.print("Enter a new id: ");
				int n_id= sc1.nextInt(); //reads string.
				
				id.add(n_id);
				System.out.println(id);
	
	
	

}
}

