import java.util.Scanner;

public class Patient {
    Double temperature;
    double topBloodPressure;
    double bottomBloodPressure;
    double weight; //pounds
    double height; // inches and feet
    String[] symptoms = new String[3];

    Scanner input = new Scanner(System.in);

    public Patient(){

    }
    public Patient(Double temperature, double topBloodPressure, double bottomBloodPressure, double weight, double height, String[] symptoms) {
        this.temperature = temperature;
        this.topBloodPressure = topBloodPressure;
        this.bottomBloodPressure = bottomBloodPressure;
        this.weight = weight;
        this.height = height;
        this.symptoms = symptoms;
    }

    // and all getters and setters here
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature() {
        System.out.println("Please look at the thermometer and type in the current body temperature");
        this.temperature = input.nextDouble();
    }
    public double getTopBloodPressure() {
        return topBloodPressure;
    }

    public void setTopBloodPressure() {
        System.out.println("Please type your current top blood pressure");
        this.topBloodPressure = input.nextDouble();
    }

    public double getBottomBloodPressure() {
        return bottomBloodPressure;
    }

    public void setBottomBloodPressure() {
        System.out.println("Please type your current bottom blood pressure");
        this.bottomBloodPressure = input.nextDouble();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        System.out.println("Please type in your weight, do not be shy, we are all professionals");
        this.weight = input.nextDouble();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        System.out.println("Please type your height");
        this.height = input.nextDouble();
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms() {
        System.out.print("Please pick and type in 3 of listed symptoms:\n - headache\n - pain in the stomach\n - dizziness\n - toothache\n - chills\n - sadness\n - sleepy\n - blurred vision\n - tired");
        for (int i = 0; i < 3; i++) {
            symptoms[i] = input.next();
        }

    }


}
