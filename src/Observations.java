public class Observations {

    public int heartRate() {
        int heartRate = 75;
        return heartRate;
    }

    public String bloodPressure() {
        String bloodPressure = "120/80 mmHg";
        return bloodPressure;
    }

    public double temperature() {
        double temperature = 98.6;
        return temperature;
    }

    public static String toStringDouble(double value) {
        return Double.toString(value);

    }
    public static String toStringInt(int value) {
        return Integer.toString(value);

    }



}
