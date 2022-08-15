import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
    Contact contact = new Contact("4", "Jerry", "Sawyer", "323456583", "12 Swoon Road"); // making the object as a class member so that all the methods can access it

    @Test
    void getContactID() {
        assertEquals("4", contact.getContactID());
    }

    @Test
    void getFirstName() {
        assertEquals("Jerry", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Sawyer", contact.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("323456583", contact.getPhoneNumber());
    }

    @Test
    void getAddress() {
        assertEquals("12 Swoon Road", contact.getAddress());
    }

}
