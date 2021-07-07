import java.util.Scanner;

public class Nurse {
    // nurse asks for temperature, blood pressure, weight, height, symptoms

//    Reception r;


    Scanner input = new Scanner(System.in);

    public Nurse(){

    }

    public void setPatientInfo(Patient p) {
        System.out.println("Good afternoon! I am your nurse Lida");
        System.out.println("How are you feeling? Don't answer, we will get all the information in a moment.");
        p.setTemperature();
        p.setTopBloodPressure();
        p.setBottomBloodPressure();
        p.setWeight();
        p.setHeight();
        p.setSymptoms();

        // this.reception.addCompletePatient(p)

        System.out.println("Thank you for your time. Please wait here. Doctor will be with you as soon as he finishes lunch\n");
    }
}
