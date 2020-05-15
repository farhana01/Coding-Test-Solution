public class NormalVehicle extends Vehicle {
    private String [] engineChoice= {"Oil","Gas","Diesel"};

    public NormalVehicle() {
        super();
        vehicleType="Normal";
        System.out.println("Choose a engine type : 1) Oil 2) Gas 3) Diesel");
        int choice=readOption(1,3);
        engineType=engineChoice[choice-1];
    }
}

