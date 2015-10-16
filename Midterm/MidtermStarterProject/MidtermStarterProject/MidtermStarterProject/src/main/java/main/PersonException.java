package main;

import com.cisc181.core.Person;

public class PersonException extends Exception {

	private Person thePerson;
	
	public PersonException(){
		
	}
	

    public PersonException (Person thePerson) {
        this.thePerson = thePerson;
    }

	
}
