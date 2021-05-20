import java.time.LocalDate;
//--------------------------
//Abstract Class: Reception
//--------------------------

public  class Reception  {

		public Reception(){

		}
	/*
	 * reception id(event id)
	 */
	private int rcptID;
	/*
	 * event date;
	 */
	LocalDate date = LocalDate.now();
	/*
	 * patient check in
	 */
	private Checkin  checkin;
	/*
	 * patient check out
	 */
	private Checkout checkout;
	/*
	 * receptionist info
	 */
	//private Receptionist rcptnist;
	//setter
	public void setCheckin(Checkin checkin) {
		this.checkin = checkin;
	}
	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	//getter
	public int getRcptID() {
		// reception id create(Randomly 100000~999999)
		rcptID = (int)(Math.random()*900000 + 100000) ;
		return rcptID;
	}
	public LocalDate getDate() {
		return date;
	}
	public Checkin getCheckin() {
		return checkin;
	}
	public Checkout getCheckout() {
		return checkout;
	}
	/*public Receptionist getRcptnist() {
		//rcptnist = new Receptionist(6591289,"Liam","514-917-6875","5","3");
		
		return rcptnist;
	}
	//reception info
	public void reception() {
		getRcptnist().displayRcptInfo();
	}*/
	//abstract method
	//public abstract void checkInfo() ;
}
