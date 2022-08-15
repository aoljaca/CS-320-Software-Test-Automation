public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactId,String firstName,String lastName,String phone,String address){
		if(contactId.length() <= 10 && contactId != null) {
			this.contactID = contactId;
		}
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phone);
		this.setAddress(address);
	}
    // Set phone number
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() <= 10 && phoneNumber != null) {
			this.phoneNumber = phoneNumber;
		}
	}
    // Set last name
    public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}
	// Set address
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}
	}
    // Set first name
    public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
    // Get contact Id
	public String getContactID() {
		return contactID;
	}
    // Get address
    public String getAddress() {
		return address;
	}
    // Get last name
    public String getLastName() {
		return lastName;
	}
    // Get first name
	public String getFirstName() {
		return firstName;
    }
    // Get phone number
    public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}

