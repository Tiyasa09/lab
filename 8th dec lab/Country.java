package lab8thdec;

/*Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.

NOTE: You can test the methods using a main method.*/


import java.util.HashSet;
import java.util.Iterator;

public class Country { //main class
	HashSet<String> H = new HashSet<>(); //creating hashset
	
	public HashSet<String> storeCountryNames(String CountryName) { //1st method
		H.add(CountryName); //adding
		return H;
	}
	
	public String retrieveCountry(String CountryName) {  //2nd method
		Iterator<String> it = H.iterator(); //iteration
		
		while (it.hasNext()) {  //loop
			if (it.next().equals(CountryName)) //checking
				return CountryName;
		}
		
		return null;
	}


	public static void main(String[] args) {  //main method
		Country countries = new Country(); //creating object of class country
		//store country name
		countries.storeCountryNames("India");
		countries.storeCountryNames("China");
		countries.storeCountryNames("Bangladesh");
		countries.storeCountryNames("Bhutan");
		//checking and print
		System.out.println("China: " + countries.retrieveCountry("China")); 
		System.out.println("Bhutan: " + countries.retrieveCountry("Bhutan")); 
		System.out.println("Japan: " + countries.retrieveCountry("Japan"));		
	}

}

