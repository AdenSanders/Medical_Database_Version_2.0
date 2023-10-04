public class Database {

 private static final int MAX_SIZE = 1000;

 public String getFirst() {
return Patients.firstName;

 }
    public String getLast() {
        return Patients.lastName;

    }
    public String getDate(){
     return Patients.dateOfBirth;

    }
    private int patientCount;

    private void patientList() {
        String[] patientList = new String[MAX_SIZE];
        patientCount = 0;

    }
    private boolean addPatient(String first, String last,String dateOfBirth) {
        if (patientCount < MAX_SIZE) {

            for (int i = 0; i < patientCount; i++) {


        }

    }


}
