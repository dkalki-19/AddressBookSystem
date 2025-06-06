package addressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("welcome to Address Book System");
		
        AddressBook addressBook = new AddressBook();

        System.out.print("Enter First Name: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastname = scanner.nextLine();
		
		System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter ZIP Code: ");
        long zip = scanner.nextLong();

        System.out.print("Enter Phone Number: ");
        long phoneNo = scanner.nextLong ();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstname, lastname, address, city, state, zip, phoneNo, email);
        addressBook.addContact(newContact);
        
        System.out.println("Current Contacts in Address Book:");
        for (Contact contact : addressBook.getContacts()) {
            System.out.println(contact);
        }
        
        System.out.print("\nDo you want to edit a contact? (yes/no): ");
        String editChoice = scanner.nextLine();

        if (editChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the First Name of the contact to edit: ");
            String nameToEdit = scanner.nextLine();
            addressBook.editContact(nameToEdit, scanner);

            System.out.println("Updated Contacts in Address Book:");
            for (Contact contact : addressBook.getContacts()) {
                System.out.println(contact);
            }
        }


	}
}
