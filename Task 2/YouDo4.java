
class Sensor{
    String name = "TS";
    int batteryLevel;

    void charge(){
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class main4 {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.charge();
        System.out.println("Current Battery Level: " + s.batteryLevel);
    }
}
