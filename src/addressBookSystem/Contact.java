package addressBookSystem;

public class Contact {

	String firstname ;
	String lastname ;
	String address ; 
	String city;
	String state;
	long zip;
	long phoneNo ; 
	String email;
	
	Contact(String firstname,String lastname,String address,String city,String state,long zip,long phoneNo,String email){
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address ;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email=email;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname ; 
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void address(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setZip(long zip) {
		this.zip = zip;
	}
	
	public long getZip() {
		return zip;
	}
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Contact{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +	
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
	}
}
