/**
   A class that creates an Application. This class acts as the driver for the dictionary class. This is used for testing purposes
   @author Andrew Gordon
   @CS215
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//must make sure path is correct before compiling
		 File text = new File("C:/Users/agord/Desktop/DictionaryWordValuePairs.txt");
		 
		 //pasfing through the file through a scanner and instantiating a scanner object
			Scanner scan=new Scanner(text);
			
		//instantiating a dictionary
		Dictionary archaicDictionary=new  Dictionary();
			
		
		
		//invoking readfile method from dictionary
		archaicDictionary.readFile(scan);
		
		System.out.println("**********************Printing Dictionarywith printDic() method**********************");
		//printing dictionary key and elements
		archaicDictionary.printDic();
		
		
		System.out.println("**********************Printing searched string key,value,hash with get() method**********************\n");
		//testing searching getting 5 words from dictionary
		archaicDictionary.get("fare");
		archaicDictionary.get("sennight");
		archaicDictionary.get("therewith");
		archaicDictionary.get("divers");
		archaicDictionary.get("garland");
		

		
	}//end main method
}//end application class
