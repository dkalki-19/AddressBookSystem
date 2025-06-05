package addressBookSystem;

import java.util.ArrayList;

public class AddressBook {

	ArrayList<Object> contacts;;
	
	AddressBook(){
		this.contacts =  new ArrayList() ;
	}
	
	public void addContacts(Contact contact) {
		contacts.add(contact);
		
	}
}
