package interfaceVsAbstractClass;

abstract class Vehicle2 {

    String mode;
    String example;

    public Vehicle2(String mode, String example) {
        this.mode = mode;
        this.example = example;
    }

    @Override
    public String toString() {
        return "Vehicle2{" +
                "mode='" + mode + '\'' +
                ", example='" + example + '\'' +
                '}';
    }

    public Vehicle2(){}

    void start(){}
    void pollution(){}
}

class AirVehicle2 extends Vehicle2{
    @Override
    void pollution() {
        System.out.println("air pollution");
        super.pollution();
    }

    @Override
    void start() {
        System.out.println("air - start success");
        super.start();
    }

    public AirVehicle2(String mode, String example) {
        super(mode, example);
    }
}

class LandVehicle2 extends Vehicle2{
    @Override
    void pollution() {
        System.out.println("land pollution");
        super.pollution();
    }

    @Override
    void start() {
        System.out.println("land - start success");
        super.start();
    }

    public LandVehicle2(String mode, String example) {
        super(mode, example);
    }
}

public class AbstractEx{

    public static void main(String[] args) {
        AirVehicle2 airVehicle2 = new AirVehicle2("air","plane");
        LandVehicle2 landVehicle2 = new LandVehicle2("land","bus");

        System.out.println(landVehicle2);
        System.out.println(airVehicle2);

        landVehicle2.pollution();
        landVehicle2.start();

        airVehicle2.pollution();
        airVehicle2.start();
    }

}