import java.io.IOException;
import java.util.ArrayList;

//public class Main extends Reception{
public class Main {

    public static void main(String[] args) {
        try {
            //Receptionist nina = new Receptionist();
            //reception
            Reception rcpt = new Reception();
            Checkin checkin = new Checkin();
            rcpt.setCheckin(checkin);
            rcpt.getCheckin().AddPatientRecord(); //patient info input
            //write input data to txt file
            PatientRecordWrite pxRecWrite = new PatientRecordWrite();
            pxRecWrite.setPxRec(rcpt.getCheckin().getPxRec());
            pxRecWrite.pxRecWriter();
            System.out.println("+  The input data has been written to the file \"PatientRecord.txt\".");
            //checkin
            rcpt.getCheckin().checkInfo();   //2: Consult;
            rcpt.getCheckin().checkInfo();   //1: Appointment;
            //waiting room
            WaitingRoom waitroom = new WaitingRoom(rcpt.getCheckin().getPxRec().getId(),
                    rcpt.getCheckin().getPxRec().getFirstName(), rcpt.getCheckin().getPxRec().getSecondName());
            waitroom.displayWaitingRoomInfo();
            //
            ArrayList<Patient> patients = new ArrayList<Patient>();
            Patient p = new Patient();
            patients.add(p);
            Nurse lida = new Nurse();
            lida.setPatientInfo(p);
            Doctor James = new Doctor();
            James.doctorCheck(p);
            //checkout
            Checkout checkout = new Checkout();
            checkout.setPxRec(rcpt.getCheckin().getPxRec()); //patient setting
            rcpt.setCheckout(checkout);
            rcpt.getCheckout().checkInfo();  //1: payment
            rcpt.getCheckout().checkInfo();  //2: FAX reception
        } catch (IOException ex) {
            System.out.println("an IOException happened");
        } finally {
            System.out.println("");
        }
//    @Override
//    public void checkInfo() {
//        // TODO Auto-generated method stub
//    }
    }
}