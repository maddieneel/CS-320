import java.util.ArrayList;

public class ContactService {
	
	//list of contacts
	private ArrayList<Contact>contactList;
	
	//constructor
	public ContactService () {
		contactList = new ArrayList<>();
	}
	
	//add contact with unique ID
	public boolean addContact(Contact contact) {
		boolean contactExists = false;
		for (Contact contacts : contactList) {
			if(contacts.equals(contact)) {
				contactExists = true;
			}
		}
		if (!contactExists) {
			contactList.add(contact);
			return true;
		}
		else {
			return false;
			}
	}
	
	//delete contact per contact ID
	public boolean deleteContact(String contactID) {
		for (Contact contacts : contactList) {
			if(contacts.getContactID().equals(contactID)) {
				contactList.remove(contacts);
				return true;
			}
		}
		return false;
	}
	
	//update contact per contact ID (firstName, lastName, Number, Address)
	public boolean updateContact(String contactID, String firstName, String lastName, String Number, String Address) {
		for(Contact contacts : contactList) {
			if(contacts.getContactID().equals(contactID)) {
				if(!firstName.equals(null) && firstName.length() <= 10) {
					contacts.setFirstName(firstName);
				}
				if(!lastName.equals(null) && lastName.length() <= 10) {
					contacts.setLastName(lastName);
				}
				if(!Number.equals(null)&& Number.length() == 10) {
					contacts.setNumber(Number);
				}
				if(!Address.equals(null) && Address.length() <= 30) {
					contacts.setAddress(Address);
				}
				return true;
			}
		}
	return false;
	}
}