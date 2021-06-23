import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContactServiceTest {

	//test adding task
	@Test
	void testAdd() {
		ContactService contacts = new ContactService();
		Contact test1 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		assertEquals(true, contacts.addContact(test1));
	}
	
	//test invalid - duplicate add
	@Test
	void testInvalidAdd() {
		ContactService contacts = new ContactService();
		Contact test2 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		assertEquals(true, contacts.addContact(test2));
		Contact test3 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		assertEquals(true, contacts.addContact(test3));
	}
		
	//test deleting contact
	@Test
	void testDelete() {
		ContactService contacts = new ContactService();
		Contact test4 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		contacts.addContact(test4);
		assertEquals(true, contacts.deleteContact("A1234"));
	}
		
	//test invalid delete
	@Test
	void testInvalidDelete() {
		ContactService contacts = new ContactService();
		Contact test5 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		contacts.addContact(test5);
		assertEquals(false, contacts.deleteContact("12345"));
	}
		
	//testing updating tasks
	@Test
	void testUpdate() {
		ContactService contacts = new ContactService();
		Contact test6 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		contacts.addContact(test6);
		assertEquals(true, contacts.updateContact("A1234", "Maddie", "Neel", "1234567890", "Updated"));
	}
		
	//testing invalid update
	@Test
	void testInvalidUpdate() {
		ContactService contacts = new ContactService();
		Contact test7 = new Contact("A1234", "Maddie", "Neel", "1234567890", "DR");
		contacts.addContact(test7);
		assertEquals(false, contacts.updateContact("12345", "Maddie", "Neel", "1234567890", "Invalid"));
	}
		
}

