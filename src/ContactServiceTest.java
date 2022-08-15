import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	  // Test the add methods

	  @Test
	  public void testAdd() {
	    ContactService cs = new ContactService();

	    Contact t1 = new Contact("Z3", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    assertEquals(true, cs.addContact(t1));
	  }

	  // Test the delete methods

	  @Test
	  public void testDelete() {
	    ContactService cs = new ContactService();

	    Contact t1 = new Contact("Z3", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    Contact t2 = new Contact("Z4", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    Contact t3 = new Contact("Z5", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    cs.addContact(t1);

	    cs.addContact(t2);

	    cs.addContact(t3);

	    assertEquals(true, cs.deleteContact("Z3"));

	    assertEquals(false, cs.deleteContact("Z10"));

	    assertEquals(true, cs.deleteContact("Z5"));
	  }

	  // Test the update methods

	  @Test
	  public void testUpdate() {
	    ContactService cs = new ContactService();

	    Contact t1 = new Contact("Z3", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    Contact t2 = new Contact("Z4", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    Contact t3 = new Contact("Z5", "Jerry", "Sawyer", "8566375926", "13 Thorn Lane, USA");

	    cs.addContact(t1);

	    cs.addContact(t2);

	    cs.addContact(t3);

	    assertEquals(
	      true,
	      cs.updateContact("Z3", "John", "Lin", "8566375926", "12 Swoon Lane")
	    );

	    assertEquals(
	      false,
	      cs.updateContact("Z10", "John", "Lin", "8566375926", "13 Fox Road")
	    );
	  }
	}
