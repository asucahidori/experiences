import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class PatientRecordWrite {
	private PatientRecord pxRec;
	//
	public void setPxRec(PatientRecord pxRec) {
		this.pxRec = pxRec;
	}
	//
	public PatientRecord getPxRec() {
		return pxRec;
	}
	public void pxRecWriter()
			throws IOException { 
		//patient record write
		//file
        try {
            FileOutputStream outputStream = new FileOutputStream("PatientRecord.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            //file
            bufferedWriter.write(getPxRec().getFirstName());
            bufferedWriter.newLine();
            bufferedWriter.write(getPxRec().getSecondName());
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(getPxRec().getAge()));
            bufferedWriter.newLine();
            bufferedWriter.write(getPxRec().getAddress().getAddress());
            bufferedWriter.newLine();
            bufferedWriter.write(getPxRec().getGender());
            bufferedWriter.newLine();
            bufferedWriter.write(getPxRec().getTelNo());
            bufferedWriter.newLine();
            bufferedWriter.write(getPxRec().getEmailID());
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(getPxRec().isInsurance()));
            bufferedWriter.newLine();
            bufferedWriter.write(getPxRec().getInsuranceNum());
            bufferedWriter.newLine();           
            bufferedWriter.write(String.valueOf(getPxRec().isNewPatient()));
            bufferedWriter.newLine();            
            // 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}	 
}
