import java.time.LocalDate;
import java.util.Scanner;
//--------------------------
//SubClass: Check In 
//--------------------------
public class Checkin extends Reception {
	/*
	 * check id(Event id)
	 */
	private int    checkInID;
	/*
	 * instance appointment
	 */	
	private Appointment appt;
	/*
	 * Instance PaitentRecord
	 */
	private PatientRecord pxRec;
	/*
	 * patient consult (instance)
	 */
	private Consult consult;
	/**********************************************************
	 * patient check in Type
	 * 1: Appointment   
	 * 2: Consult  
	 **********************************************************
	 */
	private int checkInType;
	/*
	 * Check in date
	 */
	LocalDate date = LocalDate.now();
	/*
	 * setter
	 */
	public void setCheckInID(int checkInID) {
		this.checkInID = checkInID;
	}
	public void setAppt(Appointment appt) {
		this.appt = appt;
	}
	public void setConsult(Consult consult) {
		this.consult = consult;
	}
	public void setPxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}
	public void setCheckInType(int checkInType) {
		this.checkInType = checkInType;
	}
	/*
	 * getter
	 */
	public int getCheckInID() {
		return checkInID;
	}
	public Appointment getAppt() {
		return appt;
	}
	public Consult getConsult() {
		return consult;
	}	
	public int getCheckInType() {
		return checkInType;
	}
	public PatientRecord getPxRec() {
		return pxRec;
	}
	/*
	 * method: Update a Patient Record
	 */
	public void UpdatePatientRecord() {
		AddPatientRecord();
	}
	/*
	 * method: Create a new Patient Record
	 */
	Scanner input = new Scanner(System.in);
	public void AddPatientRecord() {
		PatientRecord pxRec = new PatientRecord();
		//first name
		System.out.print("+  Enter your first name: ");
		String firstName = input.next();
		pxRec.setFirstName(firstName);
		//last name
		System.out.print("+  Enter your last name: ");
		String lastName = input.next();
		pxRec.setSecondName(lastName);	
		//age
		System.out.print("+  Enter your age: ");
		int age = input.nextInt();
		pxRec.setAge(age);
		//address
		System.out.print("+  Enter your province: ");
		String province = input.next();
		System.out.print("+  Enter your city: ");
		String city = input.next();
		System.out.print("+  Enter your street Name: ");
		String streetName = input.next();
		System.out.print("+  Enter your building Number: ");
		String buildingNumber = input.next();
		System.out.print("+  Enter your room Number: ");
		String roomNo = input.next();
		System.out.print("+  Enter your postal Code: ");
		String postalCode = input.next();
		Address address = new Address();
		address.setAddress(province, city, streetName, buildingNumber, roomNo, postalCode);
		pxRec.setAddress(address);
		//gender
		System.out.print("+  Enter your gender: ");
		String gender = input.next();
		pxRec.setGender(gender);
		//Patient Telephone No
		System.out.print("+  Enter your telephone No: ");
		String telNo = input.next();
		pxRec.setTelNo(telNo);
		//Patient email ID;
		System.out.print("+  Enter your email ID: ");
		String emailID = input.next();
		pxRec.setEmailID(emailID);
		//is Insurance;
		System.out.print("+  Do you have an insurance card? (True/False) ");
		boolean isInsurance = input.nextBoolean();
		pxRec.setInsurance(isInsurance);
		//validation
		if (firstName.isEmpty() || lastName.isEmpty() || age < 0 || age > 110 
				|| postalCode.isEmpty() || gender.isEmpty() || telNo.isEmpty()
				|| emailID.isEmpty() ) {
			throw new IllegalArgumentException("input data is null!");
		}
		//insurance judge
		if(isInsurance) {
			//Patient Insurance Number;
			System.out.print("+  Enter your Insurance Number: ");
			String insuranceNum = input.next();
			pxRec.setInsuranceNum(insuranceNum);
		}
		//Patient isNewPatient;
		pxRec.setNewPatient(true);
		//Check in setter
		setPxRec(pxRec);
	}
	/*
	 * method: Display CheckInInfo
	 */
	public void checkInfo() {
		//choice CheckIn Type
		System.out.print("+  Enter your check-in choice(1:appointment; 2:consult):" );
		int type = input.nextInt();
		setCheckInType(type);
		switch(getCheckInType()){
			case 1:
				//----------------appointment-------------
				// instance Appointment set
				Appointment appt = new Appointment();
				//   setDoctorName
				appt.setDoctorName(" James");
				//   setapptType
				System.out.println("+-------------< appointment Type choice >-------------+");
				System.out.println("+  1. Schedule an appointment with doctor ");
				System.out.println("+  2. Appointment remind ");
				System.out.println("+  3. Update Appointment  ");
				System.out.println("+  4. Cancel Appointment ");
				System.out.print("+  Enter your appoinment choice : ");
				int apptType = input.nextInt();
				appt.setapptType(apptType);
				setAppt(appt);
				//method
				appt.setPxRec(getPxRec());
				getAppt().AppointmentInfo();
				//
				break;
			default:
				//----------------consult-------------
				// instance Appointment set
				Consult cons = new Consult();
				//   setConsultType
				System.out.println("+-------------< Consult Type choice >-----------------+");
				System.out.println("+  1. Your Question ");
				System.out.println("+  2. User register ");
				System.out.print("+  Enter your appoinment choice : ");
				int consType = input.nextInt();
				cons.setConsType(consType);
				if (consType == 1) {
					System.out.print("+  Enter your questions: ");
				    String strs = input.nextLine();
				    cons.setConsContent(strs);
				}
				setConsult(cons);
				//method
				cons.setPxRec(getPxRec());
				getConsult().ConsultInfo();
				//
				break;
		}
	}	
}
