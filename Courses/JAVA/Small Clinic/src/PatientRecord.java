// --------------------------
// Patient Record Management
// Encapsulation
// --------------------------
public class PatientRecord {
	/*
	 * Patient ID -> Unique Key value
	 */
	private int id;
	/*
	 * Patient firstName
	 */
	private String firstName;
	/*
	 * Patient secondName
	 */
	private String secondName;
	/*
	 * Patient age(>0 and < 110)
	 */
	private int age;
	/*
	 * Patient address (instance)
	 */
	private Address address;
	/*
	 * Patient gender(Male,Female,Other)
	 */
	private String gender;
	/*
	 * Patient Telephone No
	 */
	private String telNo;
	/*
	 * Patient Email Id
	 */
	private String emailID;
	/*
	 * Patient has an Insurance card?
	 */
	private boolean isInsurance;
	/*
	 * Patient Insurance Number
	 */
	private String InsuranceNum;
	/*
	 * Is a new patient?
	 */
	private boolean isNewPatient;
	
	/*
	 * setter
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public void setInsurance(boolean isInsurance) {
		this.isInsurance = isInsurance;
	}
	public void setNewPatient(boolean isNewPatient) {
		this.isNewPatient = isNewPatient;
	}
	public void setInsuranceNum(String insuranceNum) {
		this.InsuranceNum = insuranceNum;
	}
	/*
	 * getter
	 */
	public int getId() {
		// patient id create(Randomly 100000~999999)
		id = (int)(Math.random()*900000 + 100000) ;
		return id;
	}
	public String getPatitentName() {
		return firstName + " " + secondName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public int getAge() {
		return age;
	}
	public String getTelNo() {
		return telNo;
	}
	public String getGender() {
		return gender;
	}
	public Address getAddress() {
		return address;
	}
	public String getEmailID() {
		return emailID;
	}
	public String getInsuranceNum() {
		return InsuranceNum;
	}
	public boolean isInsurance() {
		return isInsurance;
	}
	public boolean isNewPatient() {
		return isNewPatient;
	}
}
