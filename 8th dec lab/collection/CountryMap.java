package lab8thdec;

/*Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method storeCountryCapital(String CountryName,
 *  String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Develop a method retrieveCapital(String CountryName) which returns the capital for the country 
passed from the Map M1 created in step 1.
Develop a method retrieveCountry(String capitalName) which returns the country for the capital name
 passed from the Map M1 created in step 1.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {  //main class
	private HashMap<String, String> M1;  //creating hashmap
	
	public CountryMap() {  //creating constructor
	 M1= new HashMap<String, String>();
	}
	
	public HashMap<String, String> storeCountryCapital(String CountryName, String capital) {  //1st method
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String retrieveCapital(String CountryName) {  //2nd method
		return M1.get(CountryName);
	}
	
	public String retrieveCountry(String capitalName) {  //3rd method
		Set<Entry<String, String>> set = M1.entrySet();  //for value set
		Iterator<Entry<String, String>> it = set.iterator(); //iteration object
		//iteration
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKeyValue() { //method
		HashMap<String, String> M2 = new HashMap<String, String>(); //creating hashmap
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();
        countryMap.storeCountryCapital("India", "Delhi");  //storing value
		countryMap.storeCountryCapital("Japan", "Tokyo");  //storing value
		System.out.println("Capital of India: " +countryMap.retrieveCapital("India")); //print using method
		System.out.println("Country: " +countryMap.retrieveCountry("Tokyo"));  //print using method
		System.out.println("List: " +countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKeyValue();  //value swapping
		System.out.println(M2);
	}
}