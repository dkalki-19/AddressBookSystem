package addressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contact> contacts;
	
	AddressBook(){
		this.contacts =  new ArrayList() ;
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
		 System.out.println("Contact Added Successfully");
	}
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public void editContact(String firstNameToEdit, Scanner scanner) {
	    boolean found = false;

	    for (Contact contact : contacts) {
	        if (contact.getFirstName().equalsIgnoreCase(firstNameToEdit)) {
	            System.out.println("Contact found. Enter new details.");

	            System.out.print("Enter New Last Name: ");
	            contact.setLastName(scanner.nextLine());

	            System.out.print("Enter New Address: ");
	            contact.setAddress(scanner.nextLine());

	            System.out.print("Enter New City: ");
	            contact.setCity(scanner.nextLine());

	            System.out.print("Enter New State: ");
	            contact.setState(scanner.nextLine());

	            System.out.print("Enter New ZIP Code: ");
	            contact.setZip(scanner.nextLong());

	            System.out.print("Enter New Phone Number: ");
	            contact.setPhoneNo(scanner.nextLong());

	            System.out.print("Enter New Email: ");
	            contact.setEmail(scanner.nextLine());

	            System.out.println("Contact updated successfully.");
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Contact with the name '" + firstNameToEdit + "' not found.");
	    }
	}
	
}
