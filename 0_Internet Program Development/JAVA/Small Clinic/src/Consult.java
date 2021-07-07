import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.Date;

//--------------------------
//SubClass: Consult
//--------------------------
public class Consult {
	/*
	 * Consult id(Event id)
	 */
	private int consID;
	/*
	 * Consult Number
	 */
	private int consNo;
	/**********************************************************
	 * patient Consult Type
	 *    Consult    (1 Patient's Question
	 *                2 Patient's register
	 *                )     
	 **********************************************************
	 */
	private int consType;
	/*
	 * Instance PaitentRecord
	 */
	private PatientRecord pxRec;
	/*
	 * Consult Content
	 */
	private String consContent;
	//setter
	public void setConsType(int consType) {
		this.consType = consType;
	}
	public void setConsContent(String consContent) {
		this.consContent = consContent;
	}
	public void setPxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}
	//getter
	public int getConsType() {
		return consType;
	}
	public int getConsNo() {
		// Consult number create(Randomly 10000~99999)
		consNo = (int)(Math.random()*90000 + 10000);
		return consNo;
	}
	public int getConsID() {
		// consult id create(Randomly 100000~999999)
		consID = (int)(Math.random()*900000 + 100000) ;
		return consID;
	}
	public String getConsContent() {
		return consContent;
	}
	public PatientRecord getPxRec() {
		return pxRec;
	}
	/*
	 * method: getConsultDate() -> three days later 
	 */
	public LocalDate getConsultDate() {
		//Calendar cal = Calendar.getInstance();
		LocalDate date = LocalDate.now();
		return date;
	}
	/*
	 * method: Display Consult Info
	 */
	public void ConsultInfo() {
		System.out.println("+--------------  Consult Info  -----------------------+");
		System.out.println("+                                                     +");
		switch(getConsType()) {
			case 1:
				PatientQues();
				break;
			default:
				PatientRegister() ;
				break;
		}
	}
	/*
	 * method: Display Consult Question
	 */
	public void PatientQues() {	
		System.out.println("+--------------  Patient's Question  -----------------+");
		System.out.println("+  Hi " + pxRec.getPatitentName());
		System.out.println("+  Your question: " + getConsContent());
		System.out.println("+  Thank you for your question, we'll reply soon");
		System.out.println("+  " + getConsultDate());
		System.out.println("+--------------  Question Completed  -----------------+");
	}
	/*
	 * method: Display register info
	 */
	public void PatientRegister() {
		System.out.println("+--------------  Patient Register  -------------------+");
		System.out.println("+  Hi " + pxRec.getPatitentName());
		System.out.println("+  Thanks for your register, and the info is here");
		System.out.println("+  Your address: " + pxRec.getAddress());
		System.out.println("+  Your telphone Number: " + pxRec.getTelNo());
		System.out.println("+  Your email ID: " + pxRec.getEmailID());
		System.out.println("+  Your Insurance Number: " + pxRec.getInsuranceNum());	
		System.out.println("+  " + getConsultDate());
		System.out.println("+--------------  Register Completed ------------------+");
	}
}
