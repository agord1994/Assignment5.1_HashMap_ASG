/**
   A class that creates a dictionary object by instantiating a Hashmap. Contains method readfile that reads a scanner object and places the key and value into a hashmap
	
   @author Andrew Gordon
   @CS215
*/


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class Dictionary  {

	private HashMap<String, String> dic;
	private String key;
	private String def;
	
	/** constructor instantiating a hashmap
	 *  
	 *  */
	
	public Dictionary() {
		
		this.dic =new HashMap< String,String> ();
	}//end Dictionary constructor

	
	
	/** Readfile will read a scanned file and place the first word until a blank space into the key of hashmap
	 * it will then read the rest of the line and place this string into a variable def. key and definition will then be placed into the hashmap dictionary
	 * @param a scanner object to be placed in hashmap
	 *  
	 *  */	
	public void readFile(Scanner data) {

		
		while(data.hasNext()) {
			
			
			this. key= data.next();
			String def=data.nextLine();
			dic.put(key, def);
			
		}
		data.close();
	}//end readFile
	
	
	/** 
	 *get will print the key or the value we searched for and then get() method imported from java.util will be called to print the key
	 *the string key that is passed through method will generate a hashcode. 
	 * @param a string to search for in hashmap
	 *  
	 *  */	
	
	public void get(String key) {
		System.out.println( "Key:"+key+" Defintion:"+dic.get(key)+" hash:"+key.hashCode());
		
		
	}// end getDefinition
	
	/** 
	 *This method will print out the dictionary 
	 *  
	 *  */	

	public void printDic() {
		System.out.println(dic+"\n");
	}
	
	
	
	}
