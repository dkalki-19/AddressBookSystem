package addressBookSystem;

import java.util.ArrayList;

public class AddressBook {

	ArrayList<Contact> contacts;
	
	AddressBook(){
		this.contacts =  new ArrayList() ;
	}
	
	public void addContacts(Contact contact) {
		contacts.add(contact);
		 System.out.println("Contact Added Successfully");
	}
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
}
