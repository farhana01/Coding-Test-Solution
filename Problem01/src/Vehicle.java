import java.util.Scanner;

public abstract class Vehicle {
    Scanner sc=new Scanner(System.in);
    protected String modelNumber = "default";
    protected String engineType = "default";
    protected String enginePower = "default";
    protected String tireSize = "default";
    protected String vehicleType;
    private static int vehicleIDCounter=1001;
    protected int vehicleID;

    public Vehicle() {
        System.out.println("Enter model number");
        this.modelNumber=sc.nextLine();
        System.out.println("Enter engine power");
        this.enginePower=sc.nextLine();
        System.out.println("Enter tire size");
        this.tireSize=sc.nextLine();
        vehicleID=vehicleIDCounter;
        vehicleIDCounter++;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    public void showDetails() {
        String printInformation ="Vehicle ID: " + vehicleID+
                "\nVehicle type: " + vehicleType+
                "\nModel no: " + modelNumber+
                "\nEngine Type: " + engineType+
                "\nEngine power: " + enginePower+
                "\nTire Size: " + tireSize;
        System.out.println(printInformation);
    }

    public int readOption(int optionStart, int optionEnd){
        boolean flag=false;
        int choice=-1;
        System.out.println("Please choose an option: ");
        while (choice < optionStart || choice > optionEnd){
            flag=false;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection! Please try again");
                flag=true;
            }
            if(!flag &&(choice < optionStart || choice > optionEnd)){
                System.out.println("Invalid selection! Please try again");
            }
        }
        return choice;
    }

}

