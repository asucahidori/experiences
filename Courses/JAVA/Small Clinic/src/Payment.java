import java.time.LocalDate;

//--------------------------
//Class: Payment
//--------------------------
public class Payment {
	/*
	 * Payment id(Event id)
	 */
	private int paymentID;
	/*
	 * Clinic Name
	 */
	private String clinicName;
	/*
	 * Doctor Name
	 */
	private String doctorName;
	/*
	 * Payment Number
	 */
	private int pmtNo;
	/*
	 * Checkout Type(1. check; 2. prescription; 3.other)
	 */
	private int coType;
	/*
	 * Payment  Type(1. masterCard; 2.DebitCard; 3.CreditCard)
	 */
	private int pmtType;
	/*
	 * Payment amount
	 */
	private int pmtAmt;
	/*
	 * Payment date
	 */
	private LocalDate date;
	/*
	 * patient instance
	 */
	private PatientRecord pxRec;
	//setter
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public void setCoType(int coType) {
		this.coType = coType;
	}
	public void setPmtType(int pmtType) {
		this.pmtType = pmtType;
	}
	public void setPxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}	
	//getter
	public int getPaymentID() {
		// payment id create(Randomly 100000~999999)
		paymentID = (int)(Math.random()*900000 + 100000) ;
		return paymentID;
	}
	public String getClinicName() {
		clinicName = "Super-Clinique Epsilon";
		return clinicName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public int getPmtNo() {
		// payment number create(Randomly 10000~99999)
		pmtNo = (int)(Math.random()*90000 + 10000) ;
		return pmtNo;
	}
	public int getCoType() {
		return coType;
	}
	public int getPmtType() {
		return pmtType;
	}
	public int getPmtAmt() {
		// payment amount create(Randomly 10~300)
		pmtAmt = (int)(Math.random()*291 + 10);
		return pmtAmt;
	}
	public LocalDate getDate() {
		date = LocalDate.now();
		return date;
	}
	public PatientRecord getPxRec() {
		return pxRec;
	}
	//method: PaymentInfo()
	public void PaymentInfo() {
		System.out.println("+--------------  Payment  Info  ----------------------+");
		System.out.println("+                                                     +");
		//Check Out Type
		String coTypeStr = "";
		switch(getCoType()) {
			case 1:
				coTypeStr = "Checkup";
				break;
			case 2:
				coTypeStr = "Prescription";
				break;
			default:
				coTypeStr = "Others";
				break;
		}
		//Payment  Type(1. masterCard; 2.DebitCard; 3.CreditCard)
		String pmtTypeStr = "";	
		switch(getPmtType()) {
			case 1:
				pmtTypeStr = "MasterCard";
				break;
			case 2:
				pmtTypeStr = "DebitCard";
				break;
			default:
				pmtTypeStr = "CreditCard";
				break;
		}
		System.out.println("+  Clinic Name :  " +  getClinicName());
		System.out.println("+  Payment No  :  " +  getPmtNo());
		System.out.println("+  Patient Name:  " +  pxRec.getPatitentName());
		System.out.println("+  Insurance No:  " +  pxRec.getInsuranceNum());
		System.out.println("+  Doctor  Name:  " +  getDoctorName());
		System.out.println("+  CO      Type:  " +  coTypeStr);
		System.out.println("+  Payment Type:  " +  pmtTypeStr);
		System.out.println("+  Pay   Amount:  " +  "$" +getPmtAmt());
		System.out.println("+  Payment Date:  " +  getDate());
		System.out.println("+-----------------------------------------------------+");
	}
}
