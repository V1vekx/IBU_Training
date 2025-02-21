package interfaceVsAbstractClass;


interface Vehicle{

    void Start();
    void PollutionRate();
}
class LandVehicles implements Vehicle{

    String mode;
    String example;

    public LandVehicles(String mode, String example) {
        this.mode = mode;
        this.example = example;
    }

    @Override
    public String toString() {
        return "LandVehicles{" +
                "mode='" + mode + '\'' +
                ", example='" + example + '\'' +
                '}';
    }

    @Override
    public void PollutionRate() {
        System.out.println("medium pollution rate");
    }

    @Override
    public void Start() {
        System.out.println("Starts easily");
    }
}

class AirVehicle implements Vehicle{

   String mode;
   String example;

    public AirVehicle(String mode, String example) {
        this.mode = mode;
        this.example = example;
    }

    @Override
    public String toString() {
        return "AirVehicle{" +
                "mode='" + mode + '\'' +
                ", example='" + example + '\'' +
                '}';
    }

    @Override
    public void PollutionRate() {
        System.out.println("air pollution rate us comparatively higher");
    }

    @Override
    public void Start() {
        System.out.println("air travel");
    }
}

public class InterfaceEx{

    public static void main(String[] args) {

        LandVehicles landVehicles = new LandVehicles("land","bus");
        AirVehicle airVehicle = new AirVehicle("air","plane");

        System.out.println(landVehicles);
        System.out.println(airVehicle);
        landVehicles.Start();
        landVehicles.PollutionRate();
        airVehicle.Start();
        airVehicle.PollutionRate();
    }

}
