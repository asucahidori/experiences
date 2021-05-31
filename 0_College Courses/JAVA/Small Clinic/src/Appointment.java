import java.text.SimpleDateFormat;
import java.util.Calendar;
//--------------------------
//Class: Appointment
//--------------------------
public class Appointment{
	/*
	 * Appointment id(Event id)
	 */
	private int apptID;
	/*
	 * Doctor Name
	 */
	private String doctorName;
	/*
	 * Appointment Number
	 */
	private int apptNo;
	/**********************************************************
	 * patient Appointment Type
	 * 1: Appointment(1 Schedule an appointment with doctor
	 *                2 Appointment remind
	 *                3 Update Appointment
	 *                4 Cancel Appointment)     
	 **********************************************************
	 */
	private int apptType;
	/*
	 * patient instance
	 */
	private PatientRecord pxRec;
	//setter
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public void setapptType(int apptType) {
		this.apptType = apptType;
	}
	public void setPxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}	
	//getter
	public int getApptID() {
		// appointment id create(Randomly 100000~999999)
		apptID = (int)(Math.random()*900000 + 100000) ;
		return apptID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public int getApptNo() {
		// appointment number create(Randomly 10000~99999)
		apptNo = (int)(Math.random()*90000 + 10000) ;
		return apptNo;
	}
	public int getapptType() {
		return apptType;
	}
	public PatientRecord getPxRec() {
		return pxRec;
	}
	/*
	 * method: getAppointmentDate() -> three days later 
	 */
	public String getAppointmentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 3);
		return dateFormat.format(cal.getTime());	
	}
	/*
	 * method: Display Appointment Info
	 */
	public void AppointmentInfo() {
		System.out.println("+--------------  Appointment Info  -------------------+");
		System.out.println("+                                                     +");
		switch(getapptType()) {
			case 1:
				AddAppointment();
				break;
			case 2:
				AppointRemind();
				break;
			case 3:
				UpdateAppointment();
				break;
			default:
				CancelAppointment();
				break;
		}
	}
	/*
	 * method: Display Appointment Remind
	 */
	public void AppointRemind() {
		// instance check in 
		System.out.println("+             <  Appointment Remind  >                +");	
		System.out.println("+  Hi " + pxRec.getPatitentName() 
				+ ", this a kindly reminder about your appoinment!");
		System.out.println("+  Your Email ID: " + pxRec.getEmailID());
		System.out.println("+  Your Insurance Number: " + pxRec.getInsuranceNum());
		System.out.println("+  Your Appointment Number: " + getApptNo());
		System.out.println("+  Your appointment date: " + getAppointmentDate());
		System.out.println("+  Your Doctor's Name: " + getDoctorName());
		System.out.println("+--------------  Remind Completed      ---------------+");	
	}
	/*
	 * method: Add Appointment
	 */
	public void AddAppointment() {
		// instance check in 
		System.out.println("+             <  New Appointment  >                   +");		
		System.out.println("+  Hi " + pxRec.getPatitentName() 
				+ ", Your appoinment is successful!");
		System.out.println("+  Your Email ID: " + pxRec.getEmailID());
		System.out.println("+  Your Insurance Number: " + pxRec.getInsuranceNum());
		System.out.println("+  Your Appointment Number: " + getApptNo());
		System.out.println("+  Your appointment date: " + getAppointmentDate());
		System.out.println("+  Your Doctor's Name: " + getDoctorName());
		System.out.println("+--------------  Appointment Completed ---------------+");
	}
	/*
	 * method: Update Appointment
	 */
	public void UpdateAppointment() {
		// instance check in 
		System.out.println("+             <  Appointment Update >                +");		
		System.out.println("+  Hi " + pxRec.getPatitentName() 
				+ ", Your appoinment has been updated successful!");
		System.out.println("+  Your Email ID: " + pxRec.getEmailID());
		System.out.println("+  Your Insurance Number: " + pxRec.getInsuranceNum());
		System.out.println("+  Your Appointment Number: " + getApptNo());
		System.out.println("+  Your appointment date: " + getAppointmentDate());
		System.out.println("+  Your Doctor's Name: " + getDoctorName());
		System.out.println("+--------------  Update Completed     ---------------+");	
	}
	/*
	 * method: Cancel Appointment
	 */
	public void CancelAppointment() {
		// instance check in 
		System.out.println("+             <  Appointment Cancel >                +");		
		System.out.println("+  Hi " + pxRec.getPatitentName() 
				+ ", Your appoinment has been cancelled successful!");
		System.out.println("+  Your Email ID: " + pxRec.getEmailID());
		System.out.println("+  Your Insurance Number: " + pxRec.getInsuranceNum());
		System.out.println("+  Your Appointment Number: " + getApptNo());
		System.out.println("+  Your appointment date: " + getAppointmentDate());
		System.out.println("+  Your Doctor's Name: " + getDoctorName());
		System.out.println("+--------------  Cancel Completed   -----------------+");
	}
}
