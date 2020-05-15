public class SportsVehicle extends Vehicle {
    final String engineChoice = "Oil";
    private boolean turbo;

    public SportsVehicle() {
        super();
        vehicleType = "Sports";
        System.out.println("Engine Type: Oil (fixed)");
        engineType = engineChoice;
        System.out.print("Turbo (If YES : enter 1 or if NO: enter 0) : ");
        int temp=readOption(0,1);
        turbo= temp == 1 ? true: false;

    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Turbo: " + turbo);

    }
}
