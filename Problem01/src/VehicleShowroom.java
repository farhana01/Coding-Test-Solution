import java.util.ArrayList;
import java.util.Scanner;

public class VehicleShowroom {

    private int visitorCount;
    private ArrayList<Vehicle> vehicleList;
    private boolean exit = false;
    private Scanner sc;
    private int optionStart;
    private int optionEnd;

    public VehicleShowroom() {
        this.visitorCount = 30;
        this.vehicleList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    //vehicle add method
    public void addVehicle() {
        //print vehicle choice
        System.out.println("Please choose a vehicle type\n" +
                "1) Normal\n" +
                "2) Sports\n" +
                "3) Heavy");
        //take input from user
        int whichVehicle = readOption(1,3);
        //add vehicle
        Vehicle temp=null;
        if(whichVehicle==1) temp= new NormalVehicle();
        else if (whichVehicle==2) temp= new SportsVehicle();
        else if (whichVehicle==3) temp= new HeavyVehicle();
        vehicleList.add(temp);
        if(temp.vehicleType=="Sports") visitorCount+=20;
    }

    //vehicle remove method
    public void removeVehicle(){
        if(!vehicleList.isEmpty()) {
            System.out.println("Enter the serial number of vehicle which you would like to remove ");
            //print vehicle choice
            for (int i = 0; i < vehicleList.size(); i++) {
                System.out.println((i + 1) + ") ID: " + vehicleList.get(i).vehicleID + ",  Model Number: " + vehicleList.get(i).modelNumber);
            }
            //take input from user
            int modelRemoved = readOption(1, vehicleList.size());
            //remove vehicle
            Vehicle temp = vehicleList.get(modelRemoved - 1);
            vehicleList.remove((modelRemoved - 1));
            if (temp.vehicleType == "Sports") visitorCount -= 20;
        }
        else System.out.println("Sorry! Currently showroom is empty. Try again later!");
        System.out.println();
    }

    public void showListWithVisitorCount(){
        System.out.println("--------------------------------");
        System.out.println("Expected Visitors Count: "+ visitorCount);
        System.out.println("LIST OF VEHICLES");
        for(int i = 0; i<vehicleList.size(); i++){
            System.out.println((i+1) + ") Vehicle Type: " + vehicleList.get(i).vehicleType+", Model Number: " + vehicleList.get(i).modelNumber);
        }
        System.out.println("--------------------------------");
        System.out.println();

    }

    public void showListWithDetails(){
        System.out.println("--------------------------------");
        System.out.println("****DETAIL LIST OF VEHICLES****");
        System.out.println("--------------------------------");
        for(int i = 0; i<vehicleList.size(); i++){
            vehicleList.get(i).showDetails();
            System.out.println("--------------------------------");
        }
        System.out.println("**********End of list**********");
        System.out.println();
    }

    public void runSystem() {
        while (!exit) {
            //print choice
            printOptions();
            //take input from user
            int choice = readOption(1,5);
            //take action based on user input
            action(choice);
        }
    }

    public void printOptions(){
        System.out.println("Please choose an option: " +
                "\n1) Add a vehicle" +
                "\n2) Remove a vehicle" +
                "\n3) Show the vehicle list with visitors count"+
                "\n4) Show the vehicle list with details" +
                "\n5) Exit");

    }

    public int readOption(int optionStart, int optionEnd){
        int choice=-1;
        boolean flag;
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

    private void action(int choice) {
        switch(choice){
            case 1:
                addVehicle();
                break;
            case 2:
                removeVehicle();
                break;
            case 3:
                showListWithVisitorCount();
                break;
            case 4:
                showListWithDetails();
                break;
            case 5:
                exit=true;
                break;
        }
    }
}

