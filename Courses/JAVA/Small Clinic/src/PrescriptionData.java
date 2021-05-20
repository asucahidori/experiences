import java.time.LocalDate;

//--------------------------
//Class: PrescriptionData
//--------------------------
public class PrescriptionData {
	/*
	 * RxData id(Event id)
	 */
	private int RxDataID;
	/*
	 * Clinic Name
	 */
	private String clinicName;
	/*
	 * Doctor Name
	 */
	private String doctorName;
	/*
	 * prescription create date
	 */
	private LocalDate date;
	/*
	 * prescription number (For Pharmacy, hospital)
	 */
	private int rxNum;
	/*
	 * prescription type   (1. Surgery; 2. Medicines; 3. health check)
	 */
	private int rxType;
	/*
	 * prescription valid time(xx Months)
	 */
	private int rxValidTime;
	/*
	 * patient instance
	 */
	private PatientRecord pxRec;

	//setter
	public void setrxType(int rxType) {
		this.rxType = rxType;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public void setrxNum(int rxNum) {
		this.rxNum = rxNum;
	}
	public void setrxValidTime(int rxValidTime) {
		this.rxValidTime = rxValidTime;
	}
	public void setpxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}
	//getter
	public int getRxDataID() {
		// payment id create(Randomly 100000~999999)
		RxDataID = (int)(Math.random()*900000 + 100000) ;
		return RxDataID;
	}
	public String getClinicName() {
		clinicName = "Super-Clinique Epsilon";
		return clinicName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public LocalDate getDate() {
		date = LocalDate.now();
		return date;
	}
	public int getRxNum() {
		return rxNum;
	}
	public int getRxType() {
		return rxType;
	}
	public int getRxValidTime() {
		return rxValidTime;
	}
	public PatientRecord getPxRec() {
		return pxRec;
	}
	//method: RxDataInfo()
	public void RxDataInfo() {
		//Prescription Type
		String rxTypeStr = "";
		switch(getRxType()) {
			case 1:
				rxTypeStr = "Surgery";
				break;
			case 2:
				rxTypeStr = "Medicines";
				break;
			default:
				rxTypeStr = "Health check";
				break;
		}
		System.out.println("+--------- Prescription Data Info  -------------------+");
		System.out.println("+                                                     +");
		System.out.println("+  Clinic Name : " + getClinicName());
		System.out.println("+-         < Patient Info >                          -+");
		System.out.println("+  Patient Name:  " +  pxRec.getPatitentName());
		System.out.println("+  Insurance No:  " +  pxRec.getInsuranceNum());
		System.out.println("+  Patient Age :  " +  pxRec.getAge());
		System.out.println("+  Address     :  " +  pxRec.getAddress().getAddress());
		System.out.println("+  Phone Number:  " +  pxRec.getTelNo());
		System.out.println("+-         < Prescription Info >                     -+");
		System.out.println("+  Prescriptin  Number:  " +  getRxNum());
		System.out.println("+  Doctor  Name       :  " +  getDoctorName());
		System.out.println("+  Prescriptin  Type  :  " +  rxTypeStr);
		System.out.println("+  Prescriptin  Date  :  " +  getDate());
		System.out.println("+  Validity Period    :  " +  getRxValidTime() + " months");
		System.out.println("+--------- Prescription Fax Completed  ---------------+");
	}
}
