package Entities;

public class Customer {
	private String id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String email;
	private String countrOfResidence;
	private String gender;
	private String educationStatus;
	//dýþardan eriþebilmek için

	public Customer () { 
	}
	public Customer(String id, String firstName, String lastName, int dateOfBirth, String email, String countrOfResidence,
			String gender, String educationStatus) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.countrOfResidence = countrOfResidence;
		this.gender = gender;
		this.educationStatus = educationStatus;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountrOfResidence() {
		return countrOfResidence;
	}
	public void setCountrOfResidence(String countrOfResidence) {
		this.countrOfResidence = countrOfResidence;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducationStatus() {
		return educationStatus;
	}
	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}
}
