import java.time.LocalDate;
import java.util.Scanner;

//--------------------------
//Class: Check Out
//Encapsulation
//--------------------------
public class Checkout extends Reception {
	/*
	 * check id(Event id)
	 */
	private int checkOutID;
	/*
	 * instance appointment
	 */	
	private Payment payment;
	/*
	 * Instance PaitentRecord
	 */
	private PatientRecord pxRec;
	/*
	 * patient consult (instance)
	 */
	private PrescriptionData  rxData;
	/**********************************************************
	 * patient check in Type
	 * 1: Appointment   
	 * 2: Consult  
	 **********************************************************
	 */
	private int checkOutType;
	/*
	 * Check in date
	 */
	LocalDate date = LocalDate.now();
	//setter
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public void setCheckOutType(int checkOutType) {
		this.checkOutType = checkOutType;
	}
	public void setPxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}
	public void setRxData(PrescriptionData rxData) {
		this.rxData = rxData;
	}
	//getter
	public int getCheckOutID() {
		// appointment id create(Randomly 100000~999999)
		checkOutID = (int)(Math.random()*900000 + 100000);
		return checkOutID;
	}
	public Payment getPayment() {
		return payment;
	}
	public int getCheckOutType() {
		return checkOutType;
	}
	public PatientRecord getPxRec() {
		return pxRec;
	}
	public PrescriptionData getRxData() {
		return rxData;
	}
	/*
	 * method: Display CheckInInfo
	 */
	Scanner input = new Scanner(System.in);
	public void checkInfo() {
		//choice CheckOut Type
		System.out.print("+  Enter your check-out choice(1:payment; 2:fax reception):" );
		int type = input.nextInt();
		setCheckOutType(type);
		switch(getCheckOutType()){
			case 1:
				Payment payment = new Payment();
				payment.setDoctorName(" James");
				//Checkout Type(1. check; 2. prescription; 3.other)
				payment.setCoType(2);
				//Payment  Type(1. masterCard; 2.DebitCard; 3.CreditCard)
				payment.setPmtType(3); 
				//patient record
				payment.setPxRec(getPxRec());
				setPayment(payment);
				//method
				getPayment().PaymentInfo();
				break;
			case 2:
				PrescriptionData rxData = new PrescriptionData();
				rxData.setDoctorName(" John");
				//prescription type   (1. Surgery; 2. Medicines; 3. health check)
				rxData.setrxType(2);
				//prescription number
				int rxNum = (int)(Math.random()*9000000 + 1000000) ;
				rxData.setrxNum(rxNum);
				//setrxValidTime
				int rxValidTime = 12;
				rxData.setrxValidTime(rxValidTime);
				//patient record
				rxData.setpxRec(getPxRec());
				setRxData(rxData);
				//method
				getRxData().RxDataInfo();
				break;
		}
	}
}
