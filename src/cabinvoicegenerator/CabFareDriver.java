package cabinvoicegenerator;

import java.util.Scanner;

public class CabFareDriver {

    static CabFareCalculation cabFareCalculation = new CabFareCalculation();
    public static void main(String[] args) throws FareException {
        System.out.println("Welcome to Cab Fair Calculation");
        System.out.println("Enter the number of rides");
        Scanner sc = new Scanner(System.in);
        int rides = sc.nextInt();
        int amount = 0;
        while(rides!=0){
            System.out.println("Enter the distance");
            int distance = sc.nextInt();
            System.out.println("Enter the minutes");
            int minutes = sc.nextInt();
            amount += CabFareCalculation.fareCalculation(distance,minutes);
        }
    }
}
