import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {
	

	//test contact characters
	@Test
	void testAdd() {
		Contact contacts = new Contact("12345", "Maddie", "Neel", "1234567890", "DR");
		assertTrue(contacts.getContactID().equals("12345"));
		assertTrue(contacts.getFirstName().equals("Maddie"));
		assertTrue(contacts.getLastName().equals("Neel"));
		assertTrue(contacts.getNumber().equals("1234567890"));
		assertTrue(contacts.getAddress().equals("DR"));
	}
	
	//test setting contacts
	@Test
	void testSet() {
		Contact contacts = new Contact("12345", "Maddie", "Neel", "1234567890", "DR");
		contacts.setContactID("12345");
		contacts.setFirstName("Maddie:");
		contacts.setLastName("Neel");
		contacts.setNumber("1234567890");
		contacts.setAddress("DR");
		
	}
	//test invalid contact id
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345678901234567890", "Maddie", "Neel", "1234567890", "DR" );
		}); }
	
	//test invalid first name
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Maddieeeeeeeeeeeeeeeeeeeeee", "Neel", "1234567890", "DR" );
		}); }
	
	//test invalid last name
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Maddie", "Neelllllllllllllllllllllllllllll", "1234567890", "DR" );
		}); }
	
	//test invalid number
	@Test
	void testNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Maddie", "Neel", "1234567890123456", "DR" );
		}); }
	
	//test invalid address
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Maddie", "Neel", "1234567890", "DRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" );
		}); }
	}

