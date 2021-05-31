public class Doctor {

    public void doctorCheck(Patient p){
        System.out.println("Hi, I am James, your doctor. Let me see what we have here on file...");
        if ((p.weight/(Math.pow(p.height, 2))) < 20){
            System.out.println("too low");
        }
        if (p.temperature < 36.1) {
            System.out.println("temp too low");
        }else if (p.temperature < 37.2) {
            System.out.println("temp perfect");
            if (p.topBloodPressure < 120 && p.bottomBloodPressure < 80) {
                System.out.println("normal blood pressure");
            } else {
                System.out.println("blood pressure too high");
            }
        } else {
            System.out.println("tempt too high");
        }


//        System.out.println("oh, nope. too much. im out, get the bill at the reception");
        //Good temperature and blood pressure...
    }

}
