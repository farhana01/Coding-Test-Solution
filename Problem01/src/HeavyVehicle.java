public class HeavyVehicle extends Vehicle {
    final String engineChoice= "Diesel";
    private double weight;

    public HeavyVehicle() {
        super();
        vehicleType="Heavy";
        System.out.println("Engine Type: Diesel (fixed)");
        engineType=engineChoice;
        System.out.print("Weight: ");
        //weight = sc.nextLine();
        boolean isNumber=false;
        do {
            if(sc.hasNextDouble()){
                weight=sc.nextDouble();
                isNumber=true;
            }
            else{
                isNumber=false;
                System.out.println("Invalid input! Enter numeric value!");
                sc.next();
            }
        }while (!isNumber);

    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Weight: " + weight);
    }

}
