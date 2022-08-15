import java.util.ArrayList;

public class ContactService {

  ArrayList<Contact> contacts;

  public ContactService() {
    contacts = new ArrayList<>();
  }

  // The contact service should be able to delete contacts by the contact ID.
  public boolean deleteContact(String contactID) {
    boolean deleted = false;
    for (Contact c : contacts) {
      if (c.getContactID().equalsIgnoreCase(contactID)) {
        contacts.remove(c);
        deleted = true;
        break;
      }
    }
    return deleted;
  }

  // The contact service should be able to add contacts using a unique ID
  public boolean addContact(Contact newContact) {
    boolean contains = false;
    for (Contact c : contacts) {
      if (c.getContactID().equalsIgnoreCase(newContact.getContactID())) {
        contains = true;
        break;
      }
    }

    if (!contains) {
      contacts.add(newContact);
      return true;
    } else {
      return false;
    }
  }

  public boolean updateContact(
    String contactID,
    String firstName,
    String lastName,
    String number,
    String address
  ) {
    for (Contact c : contacts) {
      if (c.getContactID().equalsIgnoreCase(contactID)) {
        if (!firstName.equals("") && (firstName.length() > 10)) {
          c.setFirstName(firstName);
        }
        if (!lastName.equals("") && (lastName.length() > 10)) {
          c.setLastName(lastName);
        }
        if (!number.equals("") && (number.length() > 10)) {
          c.setPhoneNumber(number);
        }
        if (!address.equals("") && address.length() > 30) {
          c.setAddress(address);
        }
        return true;
      }
    }
    return false;
  }
}

