public class Patients {

    public static String firstName;
    public static String lastName;
    public static String dateOfBirth;

    public void name() {
        String firstName = null;
        String lastName = null;
        String fullName= (firstName + lastName);
    }
    public String GregorianCalendar(int year, int month, int dayOfMonth){
        String dateOfBirth = String.valueOf((year + month + dayOfMonth));
        return dateOfBirth;

    }


    }


