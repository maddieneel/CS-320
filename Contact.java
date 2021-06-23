public class Contact {
	
	//attributes
	private String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
		
	public Contact(String contactID, String firstName, String lastName, String Number, String Address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name.");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name.");
		}
		if (Number == null || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid Number.");
		}
		if (Address == null || Address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address.");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;	
	}
	
	//accessor and mutator methods
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String Number) {
		this.Number = Number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
}
